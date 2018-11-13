package reyes.de.rey.app_nativa_am.Activities;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import reyes.de.rey.app_nativa_am.R;
import reyes.de.rey.app_nativa_am.SQLite.Conexion_Sqlite;
import reyes.de.rey.app_nativa_am.utilidades.Utilidades;

public class Register extends AppCompatActivity {

    private EditText usuario;
    private EditText nombre;
    private EditText apellido;
    private EditText mail;
    private EditText fec;
    private EditText password;
    private Button btn_registro;
    private CheckBox chk_reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usuario = (EditText) findViewById(R.id.usuario);
        nombre = (EditText) findViewById(R.id.nombre);
        apellido = (EditText) findViewById(R.id.Apellido);
        mail = (EditText) findViewById(R.id.Mail);
        fec = (EditText) findViewById(R.id.Nac);
        password = (EditText) findViewById(R.id.password);
        btn_registro = (Button) findViewById(R.id.btn_registrarse);

        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarUsuarios();
                startActivity(new Intent(Register.this,menuusuarioDetailFragment.class));
                }
            });

        } // On Create

    private void registrarUsuarios() {
        Conexion_Sqlite conn = new Conexion_Sqlite(this,"bd_usuarios",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Utilidades.campo_usuario,usuario.getText().toString());
        values.put(Utilidades.campo_nombre,nombre.getText().toString());
        values.put(Utilidades.campo_apellido,apellido.getText().toString());
        values.put(Utilidades.campo_fec,fec.getText().toString());
        values.put(Utilidades.campo_mail,mail.getText().toString());
        values.put(Utilidades.campo_password,password.getText().toString());
        db.close();
        } // registrarUsuarios

    }//Register

