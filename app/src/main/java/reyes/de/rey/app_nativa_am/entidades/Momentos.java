package reyes.de.rey.app_nativa_am.entidades;

import android.media.Image;

import java.util.Date;

public class Momentos {
    private String usuario;
    private String nota;
    private Image image;
    private Date fecha;
    private String ciudad;
    private String pais;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




    public Momentos(String usuario, String nota, Image image, Date fecha, String ciudad, String pais) {
        this.usuario = usuario;
        this.nota = nota;
        this.image = image;
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.pais = pais;
    }




    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }




}
