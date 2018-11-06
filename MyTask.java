/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banque;

import java.util.TimerTask;

/**
 *
 * @author emiliendenot
 */
public class MyTask extends TimerTask{
        
    private int chrono = 126;
        
    @Override public void run() {
            
        chrono--;

        if (chrono >= 0) {
        } else {
            System.out.println("Trop tard !");
        }
        
        switch (chrono) {
            case 5:
                System.out.println("Ils ne vous reste que 5 secondes !!!!");
                break;
            case 10:
                System.out.println("Ils ne vous reste que 10 secondes !!!");
                break;
            case 20:
                System.out.println("Ils ne vous reste que 20 secondes !!");
                break;
            case 30:
                System.out.println("Ils ne vous reste que 30 secondes !!");
                break;
            case 40:
                System.out.println("Ils ne vous reste que 40 secondes !!");
                break;
            case 50:
                System.out.println("Ils ne vous reste que 50 secondes !!");
                break; 
            case 60:
                System.out.println("Ils ne vous reste que 60 secondes !!!!");
                break;
            case 70:
                System.out.println("Ils ne vous reste que 70 secondes !!!");
                break;
            case 80:
                System.out.println("Ils ne vous reste que 80 secondes !!");
                break;
            case 90:
                System.out.println("Ils ne vous reste que 90 secondes !!");
                break;
            case 100:
                System.out.println("Ils ne vous reste que 100 secondes !!");
                break;
            case 110:
                System.out.println("Ils ne vous reste que 110 secondes !!");
                break;    
            case 120:
                System.out.println("C'est partie vous avez 2 minute pour trouver la suite chiffre !");
                break;
            default:
                break;
        } 
    }
    
    public int getChrono(){
        return chrono;
    }
}
