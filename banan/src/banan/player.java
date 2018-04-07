/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banan;

import java.util.Random;

/**
 *
 * @author Student
 */
public class player {
    int guess(){
        Random n = new Random();
      return  n.nextInt(6) + 1;
    }
}
