/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import utiles.*;
import modelo.*;

/**
 *
 * @author nina
 */
public class Dueño {
    private Nombre nombre;
    private long telefono;
    private Direccion direccion;

    
    /**
     * Constructor por defecto
     */
    public Dueño(){
        this.nombre= new Nombre();
        this.telefono=0;
        this.direccion= new Direccion();

    }
    /**
     * Constructor con parámetros
     * @param nom
     * @param fono
     * @param dir 
     */
    public Dueño(Nombre nom, long fono,Direccion dir){
        this.nombre= new Nombre(nom);
        this.telefono=fono;
        this.direccion= new Direccion(dir);

    }
   
    /**
     * Constructor con un Sting como parámetro con todos los valores 
     * separados por comas 
     * @param dueño 
     */
    public Dueño(String dueño){
        String[] datos= dueño.split(",");
        
        this.nombre= new Nombre(datos[0],datos[1]);
        this.telefono=Long.parseLong(datos[2]);
        
        String calle= datos[3];
        int num= Integer.parseInt(datos[4]);
        String block= datos[5];
        String comuna= datos[6];
        int codPostal= Integer.parseInt(datos[7]);
        this.direccion= new Direccion(calle, num,block, comuna,codPostal);
    }
    /**
     * Constructor de copia
     * @param d 
     */
    public Dueño(Dueño d){
        this.nombre= new Nombre(d.nombre);
        this.telefono=d.telefono;
        this.direccion= new Direccion(d.direccion);
    }

    /**
     * Getter y setters
     * @return 
     */
    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }  
    
    /**
     * 
     * @return el objeto como una lista de valores separados por comas
     */
    @Override
    public String toString(){
       return this.nombre.toString() +
               "," + this.telefono+
               "," + this.direccion.toString();    
    }
   
}
