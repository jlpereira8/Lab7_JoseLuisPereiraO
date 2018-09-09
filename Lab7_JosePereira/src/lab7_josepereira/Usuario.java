/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josepereira;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author j0c3lwiz
 */
public class Usuario implements Serializable{
     private String nombre;
    private int edad;
    private String sexo;
    private String user;
    private String contra;
    private ArrayList<Intereses> intereses=new ArrayList();
    private ArrayList<Usuario> amigos=new ArrayList();
    private ArrayList<Usuario> amigos_interesados=new ArrayList();
    private String descripcion;
    private Icon foto;
    private ArrayList<Mensaje> mensajes=new ArrayList();
    private ArrayList<Usuario> solicitudes_amistad=new ArrayList();
    private ArrayList<Usuario> usuarios_bloqueados=new ArrayList();
    private ArrayList<Usuario> usuarios_NO_bloqueados=new ArrayList();
    private Calendario calendario;
    private String premium_si_no;
    public static final long serialVersionUID = 418L;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String sexo, String user, String contra, String descripcion, Icon foto, String premium_si_no) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.user = user;
        this.contra = contra;
        this.descripcion = descripcion;
        this.foto = foto;
      
        this.premium_si_no = premium_si_no;
    }

    public ArrayList<Usuario> getUsuarios_NO_bloqueados() {
        return usuarios_NO_bloqueados;
    }

    public void setUsuarios_NO_bloqueados(ArrayList<Usuario> usuarios_NO_bloqueados) {
        this.usuarios_NO_bloqueados = usuarios_NO_bloqueados;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<Intereses> getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList<Intereses> intereses) {
        this.intereses = intereses;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Usuario> getAmigos_interesados() {
        return amigos_interesados;
    }

    public void setAmigos_interesados(ArrayList<Usuario> amigos_interesados) {
        this.amigos_interesados = amigos_interesados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Icon getFoto() {
        return foto;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }

    
    

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList<Usuario> getSolicitudes_amistad() {
        return solicitudes_amistad;
    }

    public void setSolicitudes_amistad(ArrayList<Usuario> solicitudes_amistad) {
        this.solicitudes_amistad = solicitudes_amistad;
    }

    public ArrayList<Usuario> getUsuarios_bloqueados() {
        return usuarios_bloqueados;
    }

    public void setUsuarios_bloqueados(ArrayList<Usuario> usuarios_bloqueados) {
        this.usuarios_bloqueados = usuarios_bloqueados;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    public String getPremium_si_no() {
        return premium_si_no;
    }

    public void setPremium_si_no(String premium_si_no) {
        this.premium_si_no = premium_si_no;
    }

    @Override
    public String toString() {
        return  user;
    }
    
    
    
}
