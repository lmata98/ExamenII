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
public abstract class Camisa implements Cloneable {
    private String color;
    private String talla;
    private String estampado;
    
    protected Camisa(String color, String talla, String estampado){
        setColor(color);
        setTalla(talla);
        setEstampado(estampado);
    }
 
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getEstampado() {
        return estampado;
    }

    public void setEstampado(String estampado) {
        this.estampado = estampado;
    }

     

    @Override
    public String toString() {
        return "{" + "color=" + color + ", talla=" + talla + ", estampado=" + estampado + '}';
    }
    
    
}
