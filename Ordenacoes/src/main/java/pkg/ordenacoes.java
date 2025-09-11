/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pkg;

import java.util.List;

/**
 *
 * @author laboratorio
 */
public class ordenacoes {
    public static void bolha(List<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int qtdComparacoes = 0, qtdTrocas = 0;

        System.out.println("Método Bolha:");
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

        System.out.println("Número de comparações: " + qtdComparacoes);
        System.out.println("Número de trocas: " + qtdTrocas);

    }

    public static void selecao(List<Integer> lista){
        int posMenor;
        int qtdComparacoes = 0, qtdTrocas = 0;

        System.out.println("Método Seleção:");
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

        System.out.println("Número de comparações: " + qtdComparacoes);
        System.out.println("Número de trocas: " + qtdTrocas);
    }

    public static void insercao(List<Integer> lista){
        int chave, j;
        int qtdComparacoes = 0, qtdTrocas = 0;

        System.out.println("Método Inserção:");
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
        System.out.println("Número de comparações: " + qtdComparacoes);
        System.out.println("Número de trocas: " + qtdTrocas);
    }
    
    public static void agitacao(List<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int ini = 0;
        int fim = lista.size();
        int qtdComparacoes = 0, qtdTrocas = 0;

        System.out.println("Método Agitação:");
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
        System.out.println("Número de comparações: " + qtdComparacoes);
        System.out.println("Número de trocas: " + qtdTrocas);
    }
    
    public static void pente(List<Integer> lista) {
        boolean houveTroca;
        int tmp;
        int distancia = lista.size();
        int qtdComparacoes = 0, qtdTrocas = 0;

        System.out.println("Método Pente:");
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
        System.out.println("Número de comparações: " + qtdComparacoes);
        System.out.println("Número de trocas: " + qtdTrocas);
    }
    
    public static void shell(List<Integer> lista) {
        int i, j, n;
        int tmp;
        int qtdComparacoes = 0, qtdTrocas = 0;
        int distancia = 1;

        int referenciaTamanho = 3;

        do {
            distancia = referenciaTamanho * distancia + 1;
        } while (distancia < n);

        do {
            distancia = (int)(distancia / referenciaTamanho);

            for (i = distancia; i < n; i++) {
                tmp = lista.get(i);
                for (j = i - distancia; j >= 0; j = j - distancia) {
                    qtdComparacoes++;
                    if (tmp < lista.get(j)) {
                        vetor[j + distancia] = vetor[j];
                        qtdTrocas++;
                    } else break;
                }
                vetor[j + distancia] = tmp;
                qtdTrocas++;
            }
        } while (distancia > 1);
    }
}
