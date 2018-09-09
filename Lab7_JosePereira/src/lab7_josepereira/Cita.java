/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josepereira;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * El calendario es una lista de citas que tendrá cada usuario, cada cita tiene una fecha, un usuario involucrado y un lugar.
 */
public class Cita implements Serializable{
    private Date fecha;
    private Usuario usuario_involucrado;
    private String lugar;
    //public static final long serialVersionUID = 111L;
    
    public Cita(Date fecha, Usuario usuario_involucrado, String lugar) {
        this.fecha = fecha;
        this.usuario_involucrado = usuario_involucrado;
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario_involucrado() {
        return usuario_involucrado;
    }

    public void setUsuario_involucrado(Usuario usuario_involucrado) {
        this.usuario_involucrado = usuario_involucrado;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Cita{" + "fecha=" + fecha + ", usuario_involucrado=" + usuario_involucrado + ", lugar=" + lugar + '}';
    }
    
    
    
}
