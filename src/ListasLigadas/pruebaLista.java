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
public class pruebaLista {
    public static void main(String[] args) {
        ListaLigada l = new ListaLigada();
 
        l.insertaInicio(1);
        l.insertaFinal(9);
        l.insertaFinal(89);
        l.insertaInicio(0);
        l.recorreIterativo();
    }
}
