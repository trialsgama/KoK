package reyes.de.rey.app_nativa_am.entidades;

public class Usuario {
    private String usuario;
    private String nombre;
    private String apellido;
    private String fec;
    private String mail;
    private String password;

    public Usuario(String usuario, String nombre, String apellido, String fec, String mail, String password) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fec = fec;
        this.mail = mail;
        this.password = password;
    }



    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
