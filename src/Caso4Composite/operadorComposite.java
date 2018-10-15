/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4Composite;

import Caso4Composite.expresionArimetrica;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Leonardo Mata
 */
public class operadorComposite implements expresionArimetrica {
    
    private String valor;
    private ArrayList <expresionArimetrica> expresiones ;
    private boolean valida; 
    
    public operadorComposite(String valor) {
        this.valor = valor;
        this.expresiones = new ArrayList <expresionArimetrica>();
    
    }

    @Override
    public void agregar(expresionArimetrica expresion) {
       expresiones.add(expresion);
    }
    @Override
    public boolean validar()
    {
        String respuesta="";
        Iterator<expresionArimetrica> operadorIterator= expresiones.iterator();
        valida=expresiones.size()==2;     
       if(valida){
        while(operadorIterator.hasNext())
        {
              
            expresionArimetrica expr = operadorIterator.next();
         
                        valida=expr.validar();
            respuesta +=valor;
                 
           }
       return valida;
       }
       else
       {
                valida=false;
               return valida;
       }    
    }
    
  
    
    @Override
    public String mostrar() {
        String respuesta="";
        Iterator<expresionArimetrica> operadorIterator= expresiones.iterator();
        valida=validar(); 
        
     
       if(valida){
        while(operadorIterator.hasNext())
        {
              
            expresionArimetrica expr = operadorIterator.next();
           
           if(valida){
            valida=expr.validar();
            if(expr.getClass().getName()=="Caso4Composite.operadorNumerico")
            {
               respuesta +=expr.mostrar();
                
                respuesta +=valor;
            }else
            {
               
                respuesta +="("+expr.mostrar()+")";
               
                
            }
            }
           else
           {
               operadorIterator.remove();
               valida=false;             
               respuesta="Expresion Invalida";
               return respuesta;
           }
        }
       return respuesta;
       }
       else
       {
                valida=false;
             
               respuesta = "Expresion Invalida";
              
               return respuesta;
         
       }    
    
    }

  
    
}
