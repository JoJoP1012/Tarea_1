/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
import java.util.*;
public class Ejercicio_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //LEO RADIO
        //Output LONGITUD Y AREA
        System.out.println("Ingrese el radio de su circulo: ");
        int radio = scan.nextInt();
        
        double longitud = 2*3.1416*radio;
        double area = 3.1416*(radio*radio);
        
        System.out.println("La longitud es: "+longitud + "El area es: " + area);
    }
    
}
