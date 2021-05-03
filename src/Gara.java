/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mirko Cicali
 */
public class Gara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo (2);
        Semaforo vuoto = new Semaforo(4);
        Spogliatoio s= new Spogliatoio(pieno);
        Pista a = new Pista(vuoto);
        Piloti p1= new Piloti(pieno, vuoto, s, a);
        Piloti p2= new Piloti(pieno, vuoto, s, a);
        Piloti p3= new Piloti(pieno, vuoto, s, a);
        Piloti p4= new Piloti(pieno, vuoto, s, a);
        Piloti p5= new Piloti(pieno, vuoto, s, a);
        Piloti p6= new Piloti(pieno, vuoto, s, a);
        Piloti p7= new Piloti(pieno, vuoto, s, a);
        Piloti p8= new Piloti(pieno, vuoto, s, a);
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
    }
    
}
