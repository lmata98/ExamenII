/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenii;
import Caso4Composite.operandoComposite;
import Caso4Composite.operadorNumerico;

/**
 *
 * @author Leonardo Mata
 */


public class ExamenII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    operandoComposite op= new  operandoComposite("+");
    operandoComposite op1= new  operandoComposite("*");
    operandoComposite op3= new  operandoComposite("-");
    operadorNumerico num= new operadorNumerico(75);
    operadorNumerico num1= new operadorNumerico(65);
    operadorNumerico num2= new operadorNumerico(12);
    op.agregar(num);
    
    operandoComposite op4= new  operandoComposite("-");
    operandoComposite op5= new  operandoComposite("/");
    op1.agregar(num1);
    op1.agregar(num2);
   // op.agregar(op1);

    op3.agregar(num2);
    op3.agregar(op1);
    //op.agregar(op3);
    op4.agregar(op3);
    op.agregar(op4);
    op5.agregar(num1);
    op5.agregar(op);
    //op5.mostrar();
        System.out.println(op5.mostrar());   
    }
    
}
