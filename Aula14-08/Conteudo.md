# Plano de Aula

## Aula Semana 1
    - Discussão e entendimento do Plano de Ensino
        - Ordenação: conceitos; algoritmos
        - Pesquisa: conceitos; algoritmos
        - Pesquisa Digital: algoritmos
        - Tabelas Hash: conceitos; algoritmos
        - Balanceamento em árvores: conceitos; algoritmos
        - Árvores B: conceitos; algoritmos
    - Revisão
        - Orientação a objetos: estruturação de códigos: popular, exibir, ...  com métodos de classe (static)
        - Estruturas de dados: listas nas 3 linguagens
    - Desafio: a partir dos códigos gerados em Java, C# e Python, adicionar os métodos de popular lista a partir de arquivos, tanto para listas com números inteiros, quanto para listas palavras

## Aula Semana 2
    - Realização do desafio

## Aula Semana 3
    - Conceitos e fundamentos associados à ordenação
    - Discussão e implementação de técnicas de medição de tempo nas linguagens

## Aula Semana 4
    - Ordenação
        - sort - método de ordenação nativo das linguagens
        - bolha
        - seleção
        - inserção

## Aula Semana 5
    - Ordenação
        - Implementação simples, porém alta complexidade O(n^2): quantidade de comparação e quantidade de trocas
            - bolha: estável; parte oredenada é no final
            - seleção: instável; parte ordenada é no início
            - inserção: estável; parte ordenada é no início
        - Incrementos ou melhorias dos métodos bolha e inserção
            - técnica de análise de dois elementos distantes n posições: pré-organiza e diminui o número de trocas
                - variável distância - h
            - do bolha há o pente - combsort
            - do inserção há o shellshort
            - do bolha há o shakesort/cocktailsort/agitação (sem uso de distância)
                - ordena da esquerda para direita e vice-versa

## Aula Semana 6
    ### Revisão Geral Prova
    - Revisão: bolha, seleção, inserção, agitação, pente, shell
        - O que é ordenação e por que é importante ordenar estruturas de dados?
            Organização de uma estrutura de dados usando uma ou mais chaves de controles (variável). As estruturas ordenadas tem a busca ou a pesquisa mais eficiente, devido aos algoritmos baseados em árvores.
        - Dos vários algoritmos de ordenação, há categorias que os classificam, como:
            - estabilidade
            - complexidade
            Explique o que é estabilidade e complexidade. Se necessário, dê exemplos. Quais os métodos estudados que são estáveis e quais são instáveis?
                Estabilidade define se o processo de ordenação sempre garante ou não garante a ordenação temporária da estrutura. 
                Complexidade é a quantidade de esforço computacional (tarefas, rotinas, métodos) envolvido no algoritmo.
                Estáveis: bolha, inserção e agitação
                Instáveis: seleção, pente e shell.
        - Dos métodos estudados, quais suas complexidades? Como é avaliada a complexidade de um método de ordenação?
            Bolha: O(n^2), seleção: O(n^2), inserção: O(n^2), pente: O(n^2), agitação: O(n^2), shell: O(n log n). A complexidade dos algoritmos é medida pela quantidade de comparações e trocas.
        - Dos métodos estudados, qual o melhor de ordenação?
            Depende
        - Faça um método na sua linguagem de preferência que retorne true/True se a lista enviada como parâmetro está ordenada, ou false/False caso contrário.
        ```Java
            public static boolean estaOrdenada (ArrayList<Integer> lista){
                boolean ordem;
                    for(int i = 0; i < lista.size(); i++){
                        if (lista.get(i) > lista.get(+1)){
                            ordem = false;
                        }
                        ordem = true;
                    }
                    
                    if (ordem = false){
                        return false;
                    }
                    else{
                        return true;
                    }
            }
    ```
        - Da a sequência de valores na estrutura abaixo, contabilize quantas comparações e quantas trocas há para os métodos:
            - bolha - 56 comparações e 22 trocas
            - pente - 35 comparações e 8 trocas
            - seleção

        0    1    2    3    4    5    6    7    8   
        30   90   10   20   80   10   20  40   10

    - Na sua linguagem de preferência, implemente (sem consulta) seu método escolhido para saber.

- Como ordenar pela segunda ou pela terceira chave
      Exemplo uma lista de Alunos (codigo, curso, nome) - ordenar por curso e ordenar por nome

- EXERCÍCIO
    - Na sua linguagem de preferência, reescreva o código abaixo para ordenar em um dos métodos estudados usando como chave de ordenação 1 o nome do curso e como chave de ordenação 2 
