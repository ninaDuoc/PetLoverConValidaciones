/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utiles;

/**
 * Clase que representa un RUT y, realiza validaciones de formato y contenido
 * Utiliza Excepciones de Formato
 * @author nina
 */
public class Rut {
    private int numero;
    private char dVerificador;
    
    /**Constructor explícito
     * Similar al constructor por defecto que generaría Java
     */
    public Rut(){
        this.numero=0;
        this.dVerificador='0';
    }

    /**
     * Constructor con solo un parámtro 
     * Valida que el número recibido tenga el formato de Rut:  
     * 9123456 ó  99123456
     * @param numero 
     * @throws utiles.RutInvalidoException 
     *
     */
    public Rut(int numero) throws RutInvalidoException{
        if(Integer.toString(numero).length() == 7 || 
                Integer.toString(numero).length() == 8){
            this.numero=numero;
            this.dVerificador=calcularDV();
        }
        else{
            this.numero=0;
            this.dVerificador='0';
            throw new RutInvalidoException("Incorrecta cantidad de dígitos");
        }
    }
    

     
    /**
     * Constructor que recibe un String con formato: "99999999-9"  o "9999999-9"
     * Rut nulo o no válido: 0-0
     * Usa Expresión Regular para validar formato primero
     * @param strRut (String) 
     */
    public Rut(String strRut) {
        ExpresionRegular er= new ExpresionRegular("^[1-9][0-9]{6,7}-([0-9]|K|k)$");
        try{
            if (er.esValido(strRut)){
                String[] datos= strRut.split("-");
                this.numero= Integer.parseInt(datos[0]);
                this.dVerificador= datos[1].charAt(0);

                if(!esValido()){
                    this.numero= 0;
                    this.dVerificador= '0';   
                }
            }
        }
        catch(FormatoInvalidoException e){
            this.numero= 0;
            this.dVerificador= '0'; 
            System.out.println(e.getMessage().toString());
        }
    }
    /**
     * Constructor de copia
     * @param rut (Rut): Objeto para clonarlo
     */
     public Rut(Rut rut){
        this.numero=rut.numero;
        this.dVerificador= rut.dVerificador;
    }
     /**
      * Método sobreescrito muestra el rut con formato 9111222-D
      * o  99111222-D
      * @return String representando al RUT
      */
    @Override
    public String toString(){
        return this.numero+"-"+this.dVerificador;
    }
    
         
//Método propios     
    /**
     * Realiza el cálculo del dígito verificador del Rut
     * Utiliza procedimiento Módulo 11
     * @return char correcpondiente al dígito verificador que corresponde a los
     * números del rut
     */
    private char calcularDV(){

        int factor=2;
        int suma=0;
        int intRut= this.numero;
        int d;
        while (intRut!=0){
            
            d= intRut%10;
            suma= suma + d*factor;
            factor++;
            if (factor==8){
                factor=2;
            }
            intRut= intRut/10;
        }
        //*************
        int intDV= 11 - suma%11;
        //*************
        switch(intDV){
            case 10:
                return 'K';
            case 11:
                return '0';
            default:
                return (char)(48+intDV);  //Truco para obtener el char del dígito             
        }
    }
    
    /**
     * Determina si el rut ingresado es correcto comparando su digito
     * verificador con respceto al calculado
     * @return boolean true si los dígitos verificadores coinciden
     */
    private boolean esValido(){
        char dv=calcularDV();
        return dv == this.dVerificador;
      
    }  
}
