/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author laboratorio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaMilionaria = new ArrayList<>();
        ArrayList<Integer> listaMilionariaCopia = new ArrayList<>();
        
        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){ //Adiciona 1 milhão de números
            int n = (int) (Math.random() * 3000000); //Permite os números irem até 3 mi
            listaMilionaria.add(n);
            listaMilionariaCopia.add(listaMilionaria.get(i)); //Cria uma lista cópia para comparação dos métodos
        }
    
        System.out.println("Lista original: " + listaMilionaria);
        
        System.out.println("Metodo sort: ");
        Collections.sort(listaMilionariaCopia);
        long tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de execucao do método sort: " + (tempoFim - tempoInicio) + " ms");
        System.out.println("Lista ordenada: " + listaMilionariaCopia);
        
        System.out.println("Metodo heapsort:");
        Ordenacao.heapSort(listaMilionaria);
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de execucao do método heapsort: " + (tempoFim - tempoInicio) + " ms");
        System.out.println("Lista ordenada: " + listaMilionaria);
    }
    
}
