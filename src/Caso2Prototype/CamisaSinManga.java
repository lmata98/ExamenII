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
public class CamisaSinManga extends Camisa{
    
    public CamisaSinManga() {
        super();
        
    }
    
    
    public CamisaSinManga(String color, String talla, String estampado) {
        super(color, talla, estampado);
    }
    
    
        @Override
    public IPrototype clone(){
        return new CamisaSinManga();
    }
    
     @Override
    public String toString() {
        return "CamisaSinManga{" + super.toString() + '}';
    }
}
