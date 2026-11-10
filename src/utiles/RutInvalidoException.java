/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utiles;

/**
 * Clase heredada de clase Exception y, personaliza el error
 * @author nina
 */
public class RutInvalidoException extends Exception {
    
    /**
     * Constructor que personaliza el mensaje que es enviado al constructor de 
     * la clase Exception con super()
     * @param mensaje 
     */
     public RutInvalidoException(String mensaje){
         super(mensaje);
     }
}
