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
public class CamisaMangaLarga extends Camisa{
    
    public CamisaMangaLarga() {
        super();

    }
    
    public CamisaMangaLarga(String color, String talla, String estampado) {
        super();
        setColor(color);
        setEstampado(estampado);
        setTalla(talla);
    }
     
    @Override
    public IPrototype clone(){
        return new CamisaMangaLarga();
    }

    @Override
    public String toString() {
        return "CamisaMangaLarga{" + super.toString() + '}';
    }
    
    
    
}




