/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
import java.util.*;
public class Ejercicio_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        int num = scan.nextInt();
        float conversion = 32+(9*num/5);
        System.out.println("La temperatura en Fahrenheit es: "+conversion);
    }
    
}
