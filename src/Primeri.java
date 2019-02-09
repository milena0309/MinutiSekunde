
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milena
 */
public class Primeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarisati promenljive za minute sekunde i pocetne sekunde
        
        int sec;
        int min;
        int ostaleSekunde;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Unesi vreme u sekundama ");
        sec = input.nextInt();
        
        min = sec / 60;
        ostaleSekunde = sec % 60;
        
        System.out.println("Uneto vreme je " + min + " minuta i " + ostaleSekunde + " sekundi");
        
        
        
    }
    
}
