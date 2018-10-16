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
            
            
            PrototypeCache prototipos  = new PrototypeCache();
        try {
            Camisa unaCamisa = (Camisa) prototipos.prototipos("CamisaMangaLarga");
            System.out.println("La camisa prototipada es " + unaCamisa.toString());
            
            Camisa unaCamisa2 = (Camisa) prototipos.prototipos("CamisaSinManga");
           
        } catch (CloneNotSupportedException ex) {
            System.out.println("Problemas generando clon de la camisa solicitado");
        }
        
    }
        
    
}



