/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import java.util.List;

/**
 *
 * @author laboratorio
 */
public class Ordenacoes {
    void insercao(List<Integer> lista) {
        int i, j;
        int tmp;
        int qtdComparacoes = 0, qtdTrocas = 0;
    
        for (i = 1; i < lista.size(); i++) {
            tmp = lista.get(i);
            for (j = i - 1; j >= 0; j--) {
                qtdComparacoes++;
                if (tmp < lista.get(j)) {
                    lista.set(j + 1, lista.get(j));
                    qtdTrocas++;
                } else break;
            }
            lista.set(j + 1, tmp);
            qtdTrocas++;
        }
    }
}
