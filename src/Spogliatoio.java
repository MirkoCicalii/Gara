/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mirko Cicali
 */
public class Spogliatoio {
    Semaforo pieno;

    public Spogliatoio(Semaforo pieno) {
        this.pieno = pieno;
    }
    
    public void Indossa(){
        pieno.P();
        System.out.println("vengono indossati la Tuta e Casco ");
        
    }
    public void Rimuovi(){
        pieno.V();
        System.out.println("la Tuta e il Casco vengono rimossi ");
        
    }
    
    
}
