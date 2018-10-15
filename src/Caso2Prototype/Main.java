/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2Prototype;

/**
 *
 * @author tanzanita
 */
public class Main {
            
        public static void main(String[] args) {
             PrototypeCache camisa = new PrototypeCache();
             camisa.generarPrototype();
             System.out.println("Camisa manga larga: "+camisa.getPrototype("Camisa manga larga").toString());
             System.out.println("Camisa sin manga: "+camisa.getPrototype("Camisa sin manga").toString());
         
    }
        
    
}
