/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicaciones;

import modelo.Direccion;
import modelo.Dueño;
import modelo.Mascota;
import modelo.Nombre;
import utiles.*;



/**
 *
 * @author nina
 */
public class AppPetLover {
    public static void main(){
        Direccion dir1= new Direccion("Las Amapolas",
                            1234,
                            "Providencia", 
                            7678000);
        Direccion dir2= new Direccion("Los Pensamientos,4141,44,Ñuñoa,7376000");
        Direccion dir3= new Direccion("Los Lirios",
                            9988, 
                            "Casa A",
                            "La Reina", 
                            78603000);
        
        System.out.println("\ndir1: "+ dir1.toString());
        System.out.println("dir2: "+ dir2.toString());
        System.out.println("dir3: "+ dir3.toString());
        
        Nombre nom1= new Nombre("José Pablo","Rojas");
        Nombre nom2= new Nombre("Ana María,Abarca Soto");
        Nombre nom3= new Nombre("Gustavo","Lara Jara");
        
        System.out.println("\nnom1: "+ nom1.toString());
        System.out.println("nom2: "+ nom2.toString());
        System.out.println("nom3: "+ nom3.toString());
        
        
        Dueño dueño1= new Dueño(nom1,222554433,dir1);
        Dueño dueño2= new Dueño(nom2, 997861234, dir2);
        Dueño dueño3= new Dueño(nom3, 984563444, dir3);
        
        System.out.println("\ndueño1: "+ dueño1.toString());
        System.out.println("dueño2: "+ dueño2.toString());
        System.out.println("dueño3: "+ dueño3.toString());
        
        Mascota m1= new Mascota("Cuky","Perro Poodle Toy",2,dueño1);
        Mascota m2= new Mascota("MiauMiau", "Gato Siamés", 5, dueño2);
        Mascota m3= new Mascota("Rocky","Perro Pastor Alemás",3,dueño3);
        
        System.out.println("\nm1: "+ m1.toString());
        System.out.println("m2: "+ m2.toString());
        System.out.println("m3: "+ m3.toString());
        
        System.out.println("\n"+m1.mostrar());
        System.out.println("\n"+ m2.mostrar());
        System.out.println("\n"+ m3.mostrar());


           
    }
}
