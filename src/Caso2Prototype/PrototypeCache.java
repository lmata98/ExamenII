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
        CamisaMangaLarga camisaManga = new CamisaMangaLarga("negra","L","Rayas");
        CamisaSinManga camisaSin =  new CamisaSinManga("roja","S","flores");
        
        prototipos.put ("CamisaMangaLarga",camisaManga);
        prototipos.put ("CamisaSinManga", camisaSin);
       
    }


    public Object prototipos(String tipo) throws CloneNotSupportedException{
     return prototipos.get(tipo).clone();
 }
            
    
    
    
}





