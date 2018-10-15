/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4Composite;

import Caso4Composite.expresionArimetrica;

/**
 *
 * @author Leonardo Mata
 */
public class operandoNumerico implements expresionArimetrica {
    
    private int valor;

    public operandoNumerico(int valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    

    @Override
    public void agregar(expresionArimetrica expresion) {
        
    }

    @Override
    public String mostrar( ) {
        String resp = Integer.toString(valor);
        return resp;
    }

    @Override
    public boolean validar() {
      return true;
    }

    
}
