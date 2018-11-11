package reyes.de.rey.app_nativa_am.utilidades;

public class Utilidades {
    public static final String crear_tabla = "usuarios";
    public static final String campo_usuario = "usuario";
    public static final String campo_nombre = "nombre";
    public static final String campo_apellido = "apellido";
    public static final String campo_fec = "fec";
    public static final String campo_mail = "mail";
    public static final String campo_password = "password";

    public static final String CREAR_TABLA_USUARIO = " CREATE TABLE" + crear_tabla + " ("+campo_usuario+"TEXT," + campo_nombre+ "TEXT," + campo_apellido + "TEXT," + campo_fec + "TEXT," + campo_mail + "TEXT," + campo_password + "TEXT)";

}
