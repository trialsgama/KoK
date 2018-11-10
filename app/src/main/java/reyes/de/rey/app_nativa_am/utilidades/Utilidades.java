package reyes.de.rey.app_nativa_am.utilidades;

public class Utilidades {

    //Constantes a usar

    public static final String Tabla_usuario="usuarios";
    public static final String campo_usuario = "usuario";
    public static final String campo_nombre = "nombre";
    public static final String campo_apellido = "apellido";
    public static final String campo_fec="fec";
    public static final String campo_mail="mail";
    public static final String campo_password = "password";

    public static final String Crear_Tabla_Usuario = " CREATE TABLE " + Tabla_usuario + " ("+campo_usuario+ " TEXT, "+campo_nombre+ " TEXT," + campo_apellido + " TEXT," + campo_fec  + " TEXT," + campo_mail + " TEXT, " + campo_password + " TEXT)";

}
