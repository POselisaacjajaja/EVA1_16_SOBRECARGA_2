/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_sobrecarga_2;

/**
 *
 * @author isaaczapatto
 */
public class EVA1_16_SOBRECARGA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Suma: " + suma(4, 9));
        System.out.println("Suma: " + suma(4.0, 9.0));
        System.out.println("Suma: " + suma("hola ", "mundo"));
        suma();
    
    }
    
    
    //SUMA DE DOS NÚMEROS
    
    
    //  Firma->       SUMA(int, int )
    public static int suma(int val1, int val2){
        return val1 + val2;
    }
    //     Firma->       SUMA(double, double )
    public static double suma(double val1, double val2){
        return val1 + val2;
    }
    //     Firma->       SUMA(String, String)
    public static String suma(String val1, String val2){
        return val1 + val2;
    }
    //     Firma->     SUMA()
    public static void suma(){
        System.out.println("Suma sin argumentos");
    }

}
