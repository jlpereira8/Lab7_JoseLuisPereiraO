/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josepereira;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class Calendario  implements Serializable{

    private ArrayList<Cita> Calendario;
    //public static final long serialVersionUID = 555L;

    public Calendario() {
    }

    public Calendario(ArrayList<Cita> Calendario) {
        this.Calendario = Calendario;
    }

    public ArrayList<Cita> getCalendario() {
        return Calendario;
    }

    public void setCalendario(ArrayList<Cita> Calendario) {
        this.Calendario = Calendario;
    }

    @Override
    public String toString() {
        return "Calendario{" + "Calendario=" + Calendario + '}';
    }

}
