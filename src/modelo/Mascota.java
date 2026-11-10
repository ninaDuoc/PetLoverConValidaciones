/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nina
 */
public class Mascota {
    private String nombreMascota;
    private String especie; //Mamífero, Ave, Reptil,Peces
    private int edad;
    private Dueño dueño;
    
    /**
     * Constructor por defecto
     */
    public Mascota(){
        this.nombreMascota="";
        this.especie="";
        this.edad=0;
        this.dueño= new Dueño();
    }
    /**
    * Constructor con parámetros
    * @param nom (String): Nombre de la mascota
    * @param  especie (String): Especie de la mascota
    * @param edad (int): Edad de la mascota
    * @param  dueño (Dueño): objeto de la clase Dueño: Nombre-fono-Dirección
    */
    public Mascota(String nom, String especie, int edad, Dueño dueño){
        this.nombreMascota=nom;
        this.especie=especie;
        this.edad=edad;
        this.dueño= new Dueño(dueño);
    }
    /**
     * Constructor que recibe una Mascota en formato String
     * @param m (String): Datos de la Mascota en formato String separados por comas
     */
    public Mascota(String m){
        String[]datos= m.split(",");
        this.nombreMascota=datos[0];
        this.especie=datos[1];
        this.edad=Integer.parseInt(datos[2]);
        
        String nom= datos[3];
        String apell= datos[4];        
        Nombre nombre= new Nombre(nom, apell);
        
        int fono= Integer.parseInt(datos[4]);
        
        String calle= datos[5];
        int num= Integer.parseInt(datos[6]);
        String block= datos[7];
        String comuna= datos[8];
        int codPostal= Integer.parseInt(datos[9]);
        Direccion d= new Direccion(calle,num,block,comuna,codPostal);
        
        this.dueño= new Dueño(nombre, fono, d);
    }
    
    /**
     * Constructor de copia
     * @param m (Mascota)
     */
    public Mascota(Mascota m){
        this.nombreMascota=m.nombreMascota;
        this.especie=m.especie;
        this.edad=m.edad;
        dueño= new Dueño(m.dueño);
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    
    public String toString(){
        return this.nombreMascota +","
                + this.especie+","
                +this.edad+","
                +this.dueño.toString();
    }
    /**
     * Equivalente a toString() pero con los nombres de atributos
     * @return 
     */
    public String mostrar(){
        StringBuilder s= new StringBuilder();
        s.append("Nombre mascota: ");
        s.append(this.nombreMascota);
        s.append("\n");
        s.append("Especie: ");
        s.append(this.especie);
        s.append("\n");
        s.append("Edad: ");
        s.append(this.edad);
        s.append("\n");
        s.append("Dueño: ");
        s.append(this.dueño.toString());
        return s.toString();
    }
}
