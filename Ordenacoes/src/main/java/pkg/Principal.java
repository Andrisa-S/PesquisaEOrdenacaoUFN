/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
        List<Integer> listaBolha = new ArrayList<>();
        List<Integer> listaSelecao = new ArrayList<>();
        List<Integer> listaInsercao = new ArrayList<>();
        List<Integer> listaAgitacao = new ArrayList<>();
        List<Integer> listaPente = new ArrayList<>();
        List<Integer> listaShell = new ArrayList<>();

        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int numero = (int) (Math.random() * 10000);
            listaBolha.add(numero);
            listaSelecao.add(numero);
            listaInsercao.add(numero);
            listaAgitacao.add(numero);
            listaPente.add(numero);
            listaShell.add(numero);
        }

        ordenacoes.bolha(listaBolha);
        long tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de execução do método bolha: " + (tempoFim - tempoInicio) + " ms");
        
        ordenacoes.selecao(listaSelecao);
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de execução do método seleção: " + (tempoFim - tempoInicio) + " ms");

        ordenacoes.insercao(listaInsercao);
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de execução do método inserção: " + (tempoFim - tempoInicio) + " ms");
        
        ordenacoes.agitacao(listaAgitacao);
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de execução do método agitação: " + (tempoFim - tempoInicio) + " ms");
        
        ordenacoes.pente(listaPente);
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de execução do método pente: " + (tempoFim - tempoInicio) + " ms");
        
        ordenacoes.shell(listaShell);
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de execução do método shell: " + (tempoFim - tempoInicio) + " ms");
    }
}
