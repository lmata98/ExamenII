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
        prototipos.put ("CamisaMangaLarga", new CamisaMangaLarga());
        prototipos.put ("CamisaSinManga", new CamisaSinManga());
       
    }

    public HashMap<String, Camisa> getPrototipos(String tipo) {
        return prototipos;
    }
            
    
    
    public IPrototype getPrototype(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }
}





