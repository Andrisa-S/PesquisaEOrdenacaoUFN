/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import java.util.List;

/**
 *
 * @author parks
 */
public class Metodos {
    public static Resultado bolha(List<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int qtdComparacoes = 0, qtdTrocas = 0;

        long inicio = System.currentTimeMillis();
        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                qtdComparacoes++;
                if (lista.get(i) > lista.get(i + 1)) {
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, tmp);
                    houveTroca = true;
                    qtdTrocas++;
                }
            }
        } while (houveTroca);
        long fim = System.currentTimeMillis();

        return new Resultado("Bolha", qtdComparacoes, qtdTrocas, fim - inicio);

    }

    public static Resultado selecao(List<Integer> lista){
        int posMenor;
        int qtdComparacoes = 0, qtdTrocas = 0;

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < lista.size() - 1; i++) {
            posMenor = i;
            for (int j = i + 1; j < lista.size(); j++) {
                qtdComparacoes++;
                if (lista.get(j) < lista.get(posMenor)) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                int tmp = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, tmp);
                qtdTrocas++;
            }
        }
        long fim = System.currentTimeMillis();

        return new Resultado("Seleção", qtdComparacoes, qtdTrocas, fim - inicio); 
    }

    public static Resultado insercao(List<Integer> lista){
        int chave, j;
        int qtdComparacoes = 0, qtdTrocas = 0;

        long inicio = System.currentTimeMillis();
        for (int i = 1; i < lista.size(); i++) {
            chave = lista.get(i);
            j = i - 1;
            while (j >= 0 && lista.get(j) > chave) {
                qtdComparacoes++;
                lista.set(j + 1, lista.get(j));
                j--;
                qtdTrocas++;
            }
            lista.set(j + 1, chave);
        }
        long fim = System.currentTimeMillis();

        return new Resultado("Inserção", qtdComparacoes, qtdTrocas, fim - inicio);
    }
    
    public static Resultado agitacao(List<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int ini = 0;
        int fim = lista.size();
        int qtdComparacoes = 0, qtdTrocas = 0;

        long inicio = System.currentTimeMillis();
        do {
            houveTroca = false;
            for (int i = ini; i < fim-1; i++){
                qtdComparacoes++;
                if (lista.get(i) > lista.get(i+1)) {
                    qtdTrocas++;
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, tmp);
                }
            }

            if (!houveTroca) {
                break;
            }
            fim--;

            houveTroca = false;
            for (int i = fim; i > ini+1; i--){
                qtdComparacoes++;
                if (lista.get(i) < lista.get(i-1)) {
                    qtdTrocas++;
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i-1));
                    lista.set(i-1, tmp);
                }
            }
            ini++;

        } while (houveTroca);
        long fimT = System.currentTimeMillis();

        return new Resultado("Agitação", qtdComparacoes, qtdTrocas, fimT - inicio);
    }
    
    public static Resultado pente(List<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int distancia = lista.size();
        int qtdComparacoes = 0, qtdTrocas = 0;

        long inicio = System.currentTimeMillis();
        do {
            distancia = (int) (distancia / 1.3);
            if (distancia < 1) {
                distancia = 1;
            }
            houveTroca = false;
            for (int i = 0; i+distancia < lista.size(); i++){
                qtdComparacoes++;
                if (lista.get(i) > lista.get(i+distancia)) {
                    qtdTrocas++;
                    houveTroca = true;
                    tmp = lista.get(i);
                    lista.set(i, lista.get(i+distancia));
                    lista.set(i+distancia, tmp);
                }
            }
        } while (houveTroca || distancia > 1);
        long fim = System.currentTimeMillis();

        return new Resultado("Pente", qtdComparacoes, qtdTrocas, fim - inicio);
    }
}
