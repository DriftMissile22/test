/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banan;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Student
 */
public class Banan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        

        Random n = new Random();

        System.out.println(n);
        
        
        player player=new player();
        
        
        
        int number, guess;

        do {

            System.out.println("-------------");
            number = n.nextInt(6) + 1;
            System.out.println("Wylosowane: " + number);
            guess = n.nextInt(6) + 1;
            System.out.println("Gracz:      " + guess);

        } while (guess != number);

        System.out.println("-------------");

        // TODO code application logic here
    }

}
