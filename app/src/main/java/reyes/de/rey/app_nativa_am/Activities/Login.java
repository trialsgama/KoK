package reyes.de.rey.app_nativa_am.Activities;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import reyes.de.rey.app_nativa_am.R;
import reyes.de.rey.app_nativa_am.SQLite.Conexion_Sqlite;
import reyes.de.rey.app_nativa_am.utilidades.Utilidades;

public class Login extends AppCompatActivity {

    private EditText usuario,password;
    private Button login,registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.userpassword);
        login = (Button) findViewById(R.id.btn_login);
        registrarse = (Button) findViewById(R.id.btn_register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarUsuario();
            }


        });


    }// On Create
    private void verificarUsuario() {
        String usuario_app = usuario.getText().toString();
        String pass = password.getText().toString();
        Cursor cursor;
        Conexion_Sqlite conn = new Conexion_Sqlite(this ,"bd_usuarios",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();
        cursor = db.rawQuery("select usuario,password from usuarios where usuario='"+usuario_app+"'and password = '"+pass+"'",null );
        if (cursor.moveToFirst()==true){
            String user = cursor.getString(0);
            String passw = cursor.getString(1);
            if (usuario_app.equals(user) && pass.equals(passw)){
                Intent ven = new Intent (this,menuusuarioDetailFragment.class);
                startActivity(ven);
            } // Si no coinciden el user y/o pass le notifica al usuario
            else {
                Toast toast = Toast.makeText(getApplicationContext(),"Error, usuario y contraseña incorrectos",Toast.LENGTH_SHORT);
                toast.show();
            }
        } // If si existen elementos dentro de cursor
    } // Funcion Verificar usuario
} // Login
