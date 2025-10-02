/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>(List.of(8, 3, 6, 1, 5));
        System.out.println("Lista original: " + lista);
        
        if(Ordenacao.emHeapMaximo(lista)){
            System.out.println("Em heap máximo");
        }
        else {
            System.out.println("Não em heap máximo");
        }
    }
    
}
