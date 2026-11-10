
package utiles;

/**
 * Clase que representa una expresión regular y permite validar textos 
 * de prueba.
 * @author nina
 */
public class ExpresionRegular {
    private String patron;
    
    /**
     * Crea una nueva instancia de ExpresionRegular con un patrón vacío.
     * Este constructor inicializa el patrón como una cadena vacía. 
     * Se puede establecer un patrón posteriormente utilizando el método
     * setPatron().
     */
    public ExpresionRegular(){
        this.patron="";
    }

    /**
     * Crea una nueva instancia de ExpresionRegular con un patrón específico.
     * Este constructor permite inicializar la expresión regular con un patrón
     * proporcionado como argumento. 
     * El patrón se utiliza para validar textos de prueba mediante el 
     * método esValido().
     * @param patron
     */
    public ExpresionRegular(String patron){
        this.patron=patron;
    }
    /**
     * Valida si un texto cumple con el patrón de la expresión regular.
     * Este método utiliza el patrón almacenado en la instancia de ExpresionRegular
     * para verificar si el texto proporcionado coincide con la expresión regular.
     * returntrue si el texto cumple con el patrón, false en caso contrario.
     * @param texto
     * @return boolean True si es válido, false si no lo es.
     * @throws utiles.FormatoInvalidoException
     */
    public boolean esValido(String texto)throws FormatoInvalidoException{
        if(!texto.matches(this.patron)){
            throw new FormatoInvalidoException("*****  Error de Formato ER *****");
        }
        else{
            return true;
        }
    }

    /**
     * Obtiene el patrón de la expresión regular.
     * Este método devuelve el patrón almacenado en la instancia de 
     * ExpresionRegular.
     * @return String El patrón de la expresión regular.
     */
    public String getPatron() {
        return patron;
    }
    /**
     * Establece el patrón de la expresión regular.
     * Este método permite actualizar el patrón de la expresión regular
     * almacenado en la instancia de ExpresionRegular.
     * @param patron
     */
    public void setPatron(String patron) {
        this.patron = patron;
    }   
}

