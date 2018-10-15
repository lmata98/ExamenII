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
public class PreemptiveThreadScheduler extends AbstractScheduler{
    
     public PreemptiveThreadScheduler(ISistema sistema){
         super(sistema);
     }

    @Override
    public void atenderProceso() {
        System.out.println("Atencion de procesos bajo el esquema PreemptiveThreadScheduler: ");
        sistema.implementarSistema();
    }
    
}
