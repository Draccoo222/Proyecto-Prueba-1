/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.git.prueba.pkg1;
import java.util.Random;
/**
 *
 * @author unwir
 */
public class RandomNumba {
    public static void main(String[] args){
        Random rand = new Random();
        int number = rand.nextInt(0, 100);
           
        System.out.println("Te ha salido: " + number);
    
    
    }
}
