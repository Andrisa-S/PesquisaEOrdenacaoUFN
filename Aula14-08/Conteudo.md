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
