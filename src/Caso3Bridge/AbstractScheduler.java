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
public abstract class AbstractScheduler {
    protected ISistema sistema ;
    
    //Constructor
    public AbstractScheduler(ISistema sis){
        this.sistema = sis;
    }
    
    public void setScheduler(ISistema sistema){
        this.sistema = sistema;
    }
    
    public abstract void atenderProceso();
    
}

