package reyes.de.rey.app_nativa_am.utilidades;

import android.media.Image;

import java.util.Date;

public class Utilidades {
    public static final String crear_tabla = "usuarios";
    public static final String campo_usuario = "usuario";
    public static final String campo_nombre = "nombre";
    public static final String campo_apellido = "apellido";
    public static final String campo_fec = "fec";
    public static final String campo_mail = "mail";
    public static final String campo_password = "password";
    public static final String crear_tabla_momento = "momentos";
    public static final String campo_nota = "nota";
    public static final String campo_imagen = "imagen";
    public static final String campo_fecha = "fecha";
    public static final String campo_ciudad = "ciudad";
    public static final String campo_pais = "pais";

    public static final String CREAR_TABLA_USUARIO = " CREATE TABLE " + crear_tabla + " ("+campo_usuario+" TEXT," + campo_nombre+ " TEXT," + campo_apellido + " TEXT," + campo_fec + " TEXT," + campo_mail + " TEXT," + campo_password + " TEXT)";

    public static final String CREAR_TABLA_MOMENTOS = " CREATE TABLE" + crear_tabla_momento + " ("+campo_usuario+"TEXT," + campo_nota+ "TEXT," + campo_fecha + "TEXT," + campo_ciudad + "TEXT," + campo_pais + "TEXT," + campo_imagen + "TEXT)";
}
