/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2Prototype;

import java.util.HashMap;

/**
 *
 * @author tanzanita
 */
public class PrototypeCache {
    private HashMap<String, Camisa> prototipos = new HashMap<String, Camisa>();
    
    public PrototypeCache() {
       
    }
            
    public void generarPrototype() {
        
        this.prototipos.put ("Camisa manga larga", new CamisaMangaLarga());
        this.prototipos.put ("Camisa sin manga", new CamisaSinManga());

    }
    
    
    public IPrototype getPrototype(String tipo){
        return this.prototipos.get(tipo).clone();
    }
}
