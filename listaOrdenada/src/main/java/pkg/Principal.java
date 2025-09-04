/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import java.util.ArrayList;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<Integer> lista2Numeros = new ArrayList<>();
        
        Util.popularAleatorioNumeros(listaNumeros, 10, 100, 500);
        Util.exibirListaNumeros(listaNumeros);
        
        lista2Numeros.addAll(listaNumeros);

        long tempoInicio, tempoFim;  
    
        tempoInicio = System.nanoTime();
        // rotina1
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 1: " + (tempoFim - tempoInicio)/1000000);
    
        tempoInicio = System.nanoTime();
        // rotina2
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 2: " + (tempoFim - tempoInicio)/1000000);
    }
}
