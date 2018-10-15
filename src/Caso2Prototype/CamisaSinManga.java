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
        setColor("Azul");
        setTalla("XL");
        setEstampado("Rayas");
    }
    
    
    public CamisaSinManga(String color, String talla, String estampado) {
        super();
        setColor(color);
        setTalla(talla);
        setEstampado(estampado);
    }
        @Override
    public IPrototype clone(){
        return new CamisaSinManga();
    }
}
