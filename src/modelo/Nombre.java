/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.*;

/**
 *
 * @author nina
 */
public class Nombre {
    private String nombres;
    private String apellidos;
    
    /**
     * Constructor por defecto
     * Sin parámetros
     */
    public Nombre(){
        this.nombres="";
        this.apellidos="";
    }
    /**
     * Constructor con parámetros
     * @param nombres (String)
     * @param apellidos (String)
     */
     public Nombre(String nombres, String apellidos){
        this.nombres=nombres;
        this.apellidos=apellidos;
    }
     /**
      * Constructor con un String "nombres,apellidos"
      * @param nombres (String)
      */
     public Nombre(String nombres){
        String[] datos= nombres.split(",");
        this.nombres=datos[0];
        this.apellidos=datos[1];
    } 
    /**
     * Constructor cde copia
     * @param nom (Nombre)
     */
     public Nombre(Nombre nom){
        this.nombres=nom.nombres;
        this.apellidos=nom.apellidos;
    }

    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * Métos sobreescrito
     * Genera el Nombre como una cadena de String de sus atributos
     * @return 
     */
    @Override
    public String toString(){
        return nombres+","+apellidos;
    } 
    
}
