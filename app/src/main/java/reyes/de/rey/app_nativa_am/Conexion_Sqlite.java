package reyes.de.rey.app_nativa_am;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import reyes.de.rey.app_nativa_am.utilidades.Utilidades;

public class Conexion_Sqlite extends SQLiteOpenHelper {

    final  String Crear_Tabla_Usuario = " CREATE TABLE usuarios (usuario TEXT,nombre TEXT,apellido TEXT, fec TEXT,mail TEXT, password TEXT";

    public Conexion_Sqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.Crear_Tabla_Usuario);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS usuarios");
        onCreate(db);
    }
}
