package reyes.de.rey.app_nativa_am.Activities;

import android.Manifest;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import reyes.de.rey.app_nativa_am.R;
import reyes.de.rey.app_nativa_am.SQLite.Conexion_Sqlite;

public class Momentos_activity extends AppCompatActivity {

    private static final int PICK_IMAGE = 100;
    Uri imageUri;
    ImageView foto_gallery;
    Button boton_galeria,boton_cargar;
    public TextView tvLatitud, tvLongitud, tvAltura, tvPrecision;
    private LocationManager locManager;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
    Date date = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.momentos);

        foto_gallery = (ImageView)findViewById(R.id.foto_gallery);
        boton_galeria = (Button)findViewById(R.id.galeria);
        boton_cargar = (Button)findViewById(R.id.cargar);
       // tvLatitud = (TextView);
       // tvLongitud = (TextView)findViewById(R.id.tvLongitud);
       // tvAltura = (TextView)findViewById(R.id.tvAltura);
        //tvPrecision = (TextView)findViewById(R.id.tvPrecision);

        locManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        String fecha = dateFormat.format(date);


        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)
        {
            tvLatitud.setText("No se han definido los permisos necesarios.");
            tvLongitud.setText("");
            tvAltura.setText("");
            tvPrecision.setText("");

            return;
        }else {


            Location loc = locManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            tvLatitud.setText(String.valueOf(loc.getLatitude()));
            tvLongitud.setText(String.valueOf(loc.getLongitude()));
            tvAltura.setText(String.valueOf(loc.getAltitude()));
            tvPrecision.setText(String.valueOf(loc.getAccuracy()));
        }



        boton_galeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();
            }
        });

        boton_cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    cargarMomento();
            }
        });

    }

    private void openGallery(){
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode == RESULT_OK && requestCode == PICK_IMAGE){
            imageUri = data.getData();
            foto_gallery.setImageURI(imageUri);
        }
    }

    private void cargarMomento() {
        Conexion_Sqlite conn = new Conexion_Sqlite(this,"bd_momentos",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues values = new ContentValues();

    }
}



