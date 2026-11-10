/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import utiles.*;


/**
 *
 * @author nina
 */

/**
     * Constructor por defecto
     * SIN Parámetros
     */
public class Direccion {
    private String calle;
    private int numero;
    private String depto_block_casa;
    private String comuna;
    private int codigoPostal;
    
    /**
     * Constructor con todos los parámetros
     * 
     */
    public Direccion(String calle, int numero,String depto, String comuna, int cPostal){
        this.calle=calle;
        this.numero=numero;
        this.depto_block_casa=depto;
        this.comuna=comuna;
        this.codigoPostal=cPostal;
    } 
    
    /**
     * Constructor con todos los parámetros SIN el depto o numero de casa
     * 
     */
    public Direccion(String calle, int numero,String comuna, int cPostal){
        this.calle=calle;
        this.numero=numero;
        this.depto_block_casa="-";
        this.comuna=comuna;
        this.codigoPostal=cPostal;
    } 

    public Direccion(){
        this.calle="";
        this.numero=0;
        this.depto_block_casa="";
        this.comuna="";
        this.codigoPostal=0;
    }
    /**
     * Constructor que recibe un String
     * @param direc (String) Atributos de Dirección separados por comas
     */
    public Direccion(String direc){
        String[]datos= direc.split(",");
        this.calle=datos[0];
        this.numero=Integer.parseInt(datos[1]);
        this.depto_block_casa=datos[2];
        this.comuna=datos[3];
        this.codigoPostal=Integer.parseInt(datos[4]);
    }
    
    /**
     * Constructor de copia
     * @param direc (Direccion) objeto de la clase Dirección
     */
    public Direccion(Direccion direc){
        this.calle=direc.calle;
        this.numero=direc.numero;
        this.depto_block_casa=direc.depto_block_casa;
        this.comuna=direc.comuna;
        this.codigoPostal=direc.codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDepto_block_casa() {
        return depto_block_casa;
    }

    public void setDepto_block_casa(String depto_block_casa) {
        this.depto_block_casa = depto_block_casa;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append(this.calle);
        s.append(",");
        s.append(this.numero);
        s.append(",");
        if(this.depto_block_casa.isEmpty()){
            s.append("-");
        }
        else{
            s.append(this.depto_block_casa);
        }
        s.append(",");
        s.append(this.comuna);
        s.append(",");
        s.append(this.codigoPostal);
        return s.toString();
    }
    
}
