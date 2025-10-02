/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import java.util.ArrayList;

public class Ordenacao {
        public static void heapSort(ArrayList<Integer> lista) {
        int tmp;
        int qtdComparacoes = 0, qtdTrocas = 0;
        int fe, fd; //filho da esquerda, filho da direita
        int n = lista.size();
        boolean houveTrocas;
        while (n > 1){
            houveTrocas = false;
            for (int i = 0; i*2+1 < n; i++) {
                fe = i*2+1;
                fd = i*2+2;
                qtdComparacoes++;
                
                if ( lista.get(i) < lista.get(fe) ){ //comparando o raiz com seu filho da esquerda
                    tmp = lista.get(i);
                    lista.set(i, lista.get(fe));
                    lista.set(fe, tmp);
                    qtdTrocas++;
                    houveTrocas = true;
                }
                if (fd < n) { //só vamos comparar o filho da direita se ele existir
                    qtdComparacoes++;
                    if ( lista.get(i) < lista.get(fd) ){ //comparando o raiz com seu filho da direita
                        tmp = lista.get(i);
                        lista.set(i, lista.get(fd));
                        lista.set(fd, tmp);
                        qtdTrocas++;
                        houveTrocas = true;
                    }
                }
            }
            
            if (!houveTrocas) { //Se não há trocas, está em heap máximo, logo, a lista diminui e os números são trocados
                tmp = lista.get(0);
                lista.set(0, lista.get(n-1));
                lista.set(n-1, tmp);
                qtdTrocas++;
                n--;
            }
        }
        System.out.println("Quantidade comparações: " + qtdComparacoes);
        System.out.println("Quantidade trocas: " + qtdTrocas);
    }
}
 
