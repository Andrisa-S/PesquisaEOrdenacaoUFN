/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

import java.util.ArrayList;
import java.util.Scanner;

/*Atividade:
*1) Não permitir réplicas
*2) Poder buscar um número, informando sua posição
*3) Buscar e remover um número
*/
class Util {
    public static int hash(int numero, int tamanho){
        return numero % tamanho;
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Integer>[] tabela = new ArrayList[10];
        
        for (int i = 0; i < tabela.length; i++){
            tabela[i] = new ArrayList<>();
        }
        
        //Receber um número
        int numero, endereco;
        int tmp = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Numero: ");
            numero = teclado.nextInt();
        
     
        //Calcular o endereço do número dentro da tabela para o espalhamento
        endereco = Util.hash(numero, tabela.length);
        System.out.println(endereco);
            
        if(tmp == numero){
            System.out.println("Numero já inserido: " + numero + "  Endereco: " + endereco);
        }
        
        //Inserir o número no endereço gerado
        tabela[endereco].add(numero);
        }
        
        for (int i = 0; i < tabela.length; i++){
            System.out.println("Posicao: " + i + ": " + tabela[i]);
        }
    }
}
