/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mirko Cicali
 */
public class Piloti extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    Spogliatoio s;
    Pista p;

    public Piloti(Semaforo pieno, Semaforo vuoto, Spogliatoio s, Pista p) {
        this.pieno = pieno;
        this.vuoto = vuoto;
        this.s = s;
        this.p = p;
    }
    
    public void run(){
        s.Indossa() ;
        p.Gareggia();
        s.Rimuovi();
    }
}
