/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenii;
import Caso4Composite.operadorComposite;
import Caso4Composite.operandoNumerico;

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
    
    operadorComposite op= new  operadorComposite("+");
    operadorComposite op1= new  operadorComposite("*");
    operadorComposite op3= new  operadorComposite("-");
    operandoNumerico num= new operandoNumerico(75);
    operandoNumerico num1= new operandoNumerico(65);
    operandoNumerico num2= new operandoNumerico(12);
    op.agregar(num);
    
    operadorComposite op4= new  operadorComposite("-");
    operadorComposite op5= new  operadorComposite("/");
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
