/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mirko Cicali
 */
public class Pista {
    Semaforo vuoto;

    public Pista(Semaforo vuoto) {
        this.vuoto = vuoto;
    }
    
    public void Gareggia(){
        vuoto.P();
        for (int i=0; i<15; i++)
        System.out.println("Il pilota ha fatto: "+i+"giri");
        vuoto.V();
        System.out.println("il pilota lascia la pista");
    }
}
