/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3Bridge;

/**
 *
 * @author tanzanita
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractScheduler as = new PreemptiveThreadScheduler(new WindowsPTS());
        as.atenderProceso();
        
        AbstractScheduler as1 = new TimeSliceThreadScheduler(new WindowsPTS());
        as1.atenderProceso();
        
        
    }
}
