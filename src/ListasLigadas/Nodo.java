/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasLigadas;

/**
 *
 * @author angel
 */
public class Nodo{
   private Integer dato;
   private Nodo siguiente;
    
   public Nodo(Integer dato,Nodo siguiente){
       this.dato=dato;
       this.siguiente=siguiente;
   }
   public Nodo(Integer dato){
       this.dato=dato;
   }
    public Integer getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
