/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasLigadas;

import java.util.Objects;

/**
 *
 * @author angel
 */
public class ListaLigada {

    private Nodo inicio;
    private Nodo fin;

    public ListaLigada() {
        inicio = fin = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    //listo
    public void insertaInicio(Integer dato) {
        inicio = new Nodo(dato, inicio);
        if (inicio == null) {
            fin = inicio;
        }
    }
    //listo
    public void insertaFinal(Integer dato){
        Nodo nuevo= new Nodo(dato);
        Nodo aux=inicio;
        if(vacia()){
            insertaInicio(dato);
        }else{
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    public void insertaAntesDe(Integer dato, Integer antes) {
        if (vacia() || inicio.getDato() == antes) {
            insertaInicio(dato);
        } else {
            Nodo aux = inicio;
            Nodo anterior = null;
            while (aux.getDato()!=antes) {
                anterior = aux;
                aux = aux.getSiguiente();
            }
            Nodo nuevo = new Nodo(dato);
             nuevo.setSiguiente(aux);
            anterior.setSiguiente(nuevo);
           
        }
    }
    public void insertarDespuesDe(Integer dato,Integer despues){
     if(vacia()){
         insertaInicio(dato);
     }else{
         Nodo aux=inicio;
         while(aux.getDato()!=despues){
             aux=aux.getSiguiente();
         }
         Nodo nuevo=new Nodo(dato);
          nuevo.setSiguiente(aux.getSiguiente());
         aux.setSiguiente(nuevo);
     }
 }
    public void eliminaInicio(){
        if(!vacia()){
            inicio=inicio.getSiguiente();
        }else{
            System.out.println("Lista Vacia");
        }
    }
    public void eliminaFinal(){
        Nodo aux=inicio;
        if(aux.getSiguiente()==null){
            aux=null;
        }else {
            while(aux.getSiguiente().getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }
    }
    public void eliminaElemento(Integer elemento){
        Nodo aux,anterior;
        aux=inicio;
        anterior=null;
        boolean encontrado=false;
        while(aux!=null&&!encontrado){
            encontrado=(aux.getDato()==elemento);
            if(!encontrado){
                anterior = aux;
                aux = aux.getSiguiente();
            }
        }if(aux!=null){
            if(aux==inicio){
            inicio=aux.getSiguiente();
            }else{
                anterior.setSiguiente(aux.getSiguiente());
          
            }
        }
    }
    public void eliminaAntesDe(Integer dato){
        if (vacia() ) {
            System.out.println("Lista Vacia");
        } else if(inicio.getDato() == dato){
            eliminaInicio();
        }else {
            Nodo aux = inicio;
            Nodo anterior = null;
            while (aux.getDato()!=dato) {
                anterior = aux;
                aux = aux.getSiguiente();
            }
            Nodo nuevo = new Nodo(dato);
             nuevo.setSiguiente(aux);
            anterior.setSiguiente(null);
           
        }
           
    }
    public boolean encontrarDato(Integer dato){
        Nodo aux=inicio;
            while(aux!=null){
                if(aux.getDato()==dato){
                    return true;
                }
                aux=aux.getSiguiente();
            }
            return false;
        }
    //listo
    public void buscaDesordenado(Integer dato){
        Nodo aux=inicio;
       // Integer elemento;
        if(!vacia()){
            while(aux!=null){
                if(aux.getDato()==dato){
                    System.out.println("El dato "+ dato+"Se encuentra en la posicion "+aux);
                }else{
                    System.out.println("Dato no encontrado");
                }
                aux=aux.getSiguiente();
            }
        }
    }
    public void busquedaRecursiva(Integer dato){
        Nodo nuevo=inicio;
        if(nuevo!=null){
            if(nuevo.getDato()==dato){
                System.out.println("el elemento esta en la lista ");
            }
            else{
                busquedaRecursiva(dato);
                nuevo=nuevo.getSiguiente();
            }
        }else{
            System.out.println("Elemento no se encuentra en la lista");
        }
    }
    
    public Integer obtenDatoEnPosicion(Integer posicion){
        Nodo aux=inicio;
        Integer contador=0;
        Integer dato=null;
        if(posicion>0){
            while(aux!=null){
                if(posicion==contador){
                    dato=aux.getDato();
                }
                aux=aux.getSiguiente();
                contador++;
            }
        }
        return dato;
    }
   public void recorreIterativo(){
       Nodo aux=inicio;
       while(aux!=null){
           System.out.println(aux.getDato());
            aux=aux.getSiguiente(); 
       }
   }
   public String recorreRecursivo(Nodo aux){
       if(aux!=null){
           System.out.println(aux.getDato());
           recorreRecursivo(aux.getSiguiente());
       }
           return null;
   }
    public void insertaOrdenado(Integer dato) {
        Nodo nuevo;
        nuevo = new Nodo(dato);
        if (inicio == null){        
            inicio = nuevo;
            } else if (dato < inicio.getDato()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else{
            Nodo anterior, p;
            anterior = p = inicio;
            while ((p.getSiguiente() != null) && (dato > p.getDato())) {
                anterior = p;
                p = p.getSiguiente();
            }
            if (dato > p.getDato()){
                anterior = p;
            }
            nuevo.setSiguiente(anterior.getSiguiente());
            anterior.setSiguiente(nuevo);
        }
    }
}
