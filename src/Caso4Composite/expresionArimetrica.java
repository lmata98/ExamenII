/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4Composite;

/**
 *
 * @author Leonardo Mata
 */
public interface expresionArimetrica {
    void agregar(expresionArimetrica expresion);
    String mostrar();
    boolean validar();
    
}
