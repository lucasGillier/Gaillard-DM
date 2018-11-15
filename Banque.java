/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banque;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Banque {
        
   
 
    private static int cb = 1;
   
    private static int myRandom() { 
        
        int randomNumb;

        Random rand = new Random();
        randomNumb = rand.nextInt(100);
        return randomNumb;
    }
    private static void checkValue(int res, int sol) {
        
        if (res == sol){
            System.out.println("Code bon.");
            cb++;
        }else if (res > sol) {
            System.out.println("Plus petit.");
        }else if (res < sol){
            System.out.println("Plus grand.");
        }else{
            System.out.println("Erreur, code invalide.");
        }
    }
    public static void main(String[] args) {
        
        int res1, res2, res3;  
        int sol1, sol2, sol3; 
        
        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();
        chrono t = new chrono();
        timer.schedule(t, 0, 1000);   
       
        sol1 = Banque.myRandom(); 
        sol2 = Banque.myRandom();
        sol3 = Banque.myRandom();
       
        System.out.println("Bienvenue sur le programme de 'La Bonne combinaison'.");
        System.out.println("Vous devez trouver la suite de code à trois nombres en moins d'une minute, "
                + "pour cela vous avez juste à rentrer un nombre entre 0 et 100. Bonne chance !");
 
        do {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Banque.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while(t.getChrono() >= 120);
        
        do{ 
            switch (cb) {
                case 0: 
                    break;
                case 1:
                    System.out.print("Entrez le premier code : ");
                    res1 = sc.nextInt();
                    checkValue(res1, sol1);
                    break;
                case 2:
                    System.out.print("Entrez le deuxième code : ");
                    res2 = sc.nextInt();
                    checkValue(res2, sol2);
                    break;
                case 3:
                    System.out.print("Entrez le troisième code : ");
                    res3 = sc.nextInt();
                    checkValue(res3, sol3);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Vous avez ouvert le coffre bravo!!!");
                    System.out.println("Malheureusement la police est déjà la!!!");
                    System.out.println("la police vous a arrêté.");
                    cb = 0;
                    break;
                default:
                    System.out.println("ERROR");
                    System.exit(0);
                    break;
            }
        }while (cb != 0);
        System.out.println("Programme terminé !");
        System.exit(0);
    }
}
