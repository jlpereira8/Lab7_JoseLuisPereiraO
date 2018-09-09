/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josepereira;

import java.io.Serializable;

/**
 *
 * @author j0c3lwiz
 */
public class Mensaje implements Serializable{
    private String emisor;
    private String receptor;
    private String mensaje;
   // public static final long serialVersionUID = 444L;
    public Mensaje(String emisor, String receptor, String mensaje) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.mensaje = mensaje;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "emisor=" + emisor + ", receptor=" + receptor + ", mensaje=" + mensaje + '}';
    }
    
    
    
}
