package reyes.de.rey.app_nativa_am.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import reyes.de.rey.app_nativa_am.utilidades.Utilidades;

public class Conexion_Momentos extends SQLiteOpenHelper {



    public Conexion_Momentos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_MOMENTOS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS momentos");
        onCreate(db);
    }
}
