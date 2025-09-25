Veja os vídeos para entender a dinâmica de cada método: https://www.youtube.com/@AlgoRythmics/videos

ORDENAR E PESQUISAR
    - ordenar agiliza a pesquisa
    - classificações de ordenação
        - quanto complexidade (esforço/quantidade de processamento): quantidade de comparações e quantidade de trocas
        - quanto ocupação de memória: principal ou secundária
        - quanto a estabilidade: estáveis e instáveis
C++
    - uso de arquivos .h e sua inclusão em outros programas

MÉTODOS DE ORDENAÇÃO SIMPLES

1) BOLHA - Bubble Sort
Estável
Memória Interna
Alta complexidade (muito esforço) - O(n^2)
A estrutura possui 2 partes/porções (1a é a desordenada; 2a parte é a ordenada)
Adequado para listaes e listas

0   1   2   3   4   5   6
7   1   4   2   3   9   8
1   4   2   3   7   8   9
1   2   3   4   7   8   9
1   2   3   4   7   8   9


```c#
void bolha(List<> lista) {
    bool houveTroca;
    int tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        houveTroca = False;
        for (int i = 0; i < lista.Count()-1; i++){
            qtdComparacoes++;
            if (lista[i] > lista[i+1]) {
                qtdTrocas++;
                houveTroca = True;
                tmp = lista[i];
                lista[i] = lista[i+1];
                lista[i+1] = tmp;
            }
        }
    } while (houveTroca);
}
````

```java
void bolha(List<> lista) {
    boolean houveTroca;
    int tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        houveTroca = False;
        for (int i = 0; i < lista.size()-1; i++){
            qtdComparacoes++;
            if (lista.get(i) > lista.get(i+1)) {
                qtdTrocas++;
                houveTroca = True;
                tmp = lista.get(i);
                lista.set(i, lista.get(i+1));
                lista.set(i+1, tmp);
            }
        }
    } while (houveTroca);
}
```

```python
def bolha(lista):
    houve_troca = true
    qtd_comparacoes = 0
    qtd_trocas = 0
    while (houve_troca):    
        houveTroca = false
        for i in range (len(lista) - 1):
            qtd_comparacoes+=1
            if (lista[i] > lista[i+1]):
                qtd_trocas+=1
                houve_troca = true
                tmp = lista[i]
                lista[i] = lista[i+1]
                lista[i+1] = tmp
```

Trabalha com o conceito de trocas, ou seja, enquanto houver trocas, o algoritmo não para.
É considerado bolha, porque 'leva' os maiores para o final da estrutura

Observação: se a estrutura estiver ordenada ou quase, o bolha terá excelente desempenho

2) SELEÇÃO - Selection Sort
Instável
Memória Interna
Alta complexidade (muito esforço) - O(n^2)
A estrutura possui 2 partes/porções (1a é a ordenada; 2a parte é a desordenada)
Adequado para listaes e listas

Trabalha com conceito de trocas não contíguas. É considerado seleção porque ele seleciona os menores para
o início da estrutura

Observação: se a estrutura estiver ordenada, o método vai funcionar/processar como se a estrutura estivesse desordenada

0   1   2   3   4   5   6    posMenor = 1
7   1   4   2   3   9   8
1   7   4   2   3   9   8
1   2   4   7   3   9   8
1   2   3   7   4   9   8
1   2   3   4   7   9   8
1   2   3   4   7   9   8
1   2   3   4   7   8   9
1   2   3   4   7   8   9  


```c#
void selecao(List<> lista) {
    int posMenor;
    int qtd_comparacoes = 0, qtd_trocas = 0;
    for (int i = 0; i < lista.Count()-1; i++) {
        posMenor = i;
        for (int j = i+1; j < lista.Count(); j++) {
            qtd_comparacoes++;
            if (lista[j] < lista[posMenor]) {
                posMenor = j;
            }
        }
        if (i != posMenor) {
            qtd_trocas++;
            tmp = lista[i];
            lista[i] = lista[posMenor];
            lista[posMenor] = tmp;
        }
    }
}
```

```java
void selecao(List<> lista) {
    int posMenor;
    int qtd_comparacoes = 0, qtd_trocas = 0;
    for (int i = 0; i < lista.size()-1; i++) {
        posMenor = i;
        for (int j = i+1; j < lista.size(); j++) {
            qtd_comparacoes++;
            if (lista.get(j) < lista.get(posMenor)) {
                posMenor = j;
            }
        }
        if (i != posMenor) {
            qtd_trocas++;
            tmp = lista.get(i);
            lista.set(i, lista.get(posMenor));
            lista.set(posMenor, tmp);
        }
    }
}
```

```python
def selecao(lista):
    qtd_comparacoes = 0
    qtd_trocas = 0
    for i in range(len(lista) - 1):
        posMenor = i
        for j in range(i+1, len(lista)):
            qtd_comparacoes+=1
            if (lista[j] < lista[posMenor]):
                posMenor = j
            
        if (i != posMenor):
            qtd_trocas+=1
            tmp = lista[i]
            lista[i] = lista[posMenor]
            lista[posMenor] = tmp        
```


3) INSERÇÃO - Insertion Sort - O(n^2)
Estável
Memória Interna
Alta complexidade - O(n^2)
A estrutura possui 2 partes/porções (1a é a ordenada; 2a parte é a desordenada)
Adequado para listaes e listas

Trabalha com o conceito de inserção na porção inicial, com isso, pode diminuir o número de comparações

Observação: i) se a estrutura estiver ordenada ou quase, o inserção terá excelente desempenho

Qual o melhor método de ordenação?
Depende: tamanho da estrutura; de como a estrutura já está previamente ordenada;

0   1   2   3   4   5   6
7   1   4   2   3   9   8
1   7   4   2   3   9   8
1   4   7   2   3   9   8
1   2   4   7   3   9   8
1   2   3   4   7   9   8
1   2   3   4   7   9   8
1   2   3   4   7   8   9   

```c#
void insercao(Lista<> lista) {
    int i, j;
    int tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;

    for (i = 1; i < lista.Count(); i++) {
        tmp = lista[i];
        for (j = i - 1; j >= 0; j--) {
            qtdComparacoes++;
            if (tmp < lista[j]) {
                lista[j + 1] = lista[j]; //shift eh trocar para o lado
                qtdTrocas++;
            } else break;
        }
        lista[j + 1] = tmp;
        qtdTrocas++;
    }
}
```

```java
void insercao(Lista<> lista) {
    int i, j;
    int tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;

    for (i = 1; i < n; i++) {
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
```

```python
def insercao(lista):
    qtd_comparacoes = 0
    qtd_trocas = 0

    for i in range(1, len(lista)):
        tmp = lista[i]
        for j in range(i - 1, -2, -1):
            qtd_comparacoes+=1
            if (tmp < lista[j]):
                lista[j + 1] = lista[j]
                qtd_trocas+=1
            else:
                break

        lista[j + 1] = tmp
        qtd_trocas+=1
```

4) AGITAÇÃO - Shake sort ou Cocktail
    - É baseado no Bolha, ou seja, é uma tentativa de melhorar o Bolha
    - Estável
    - Memória interna
    - ...


ini = 1
fim = 5

0   1   2   3   4   5   6
7   1   4   2   3   9   8
1   4   2   3   7   8   9
1   2   4   3   7   8   9
1   2   3   4   7   8   9
1   2   3   4   7   8   9

```c#
void agitacao(List<> lista) {
    bool houveTroca;
    int tmp;
    int ini = 0;
    int fim = lista.Count;
    int qtdComparacoes = 0, qtdTrocas = 0;

    do{
        houveTroca = False;
        for (int i = 0; i < fim-1; i++){
            qtdComparacoes++;
            if (lista[i] > lista [i+1]){
                qtdTrocas++;
                houveTroca = True;
                tmp = lista [i];
                lista[i] = lista [i+1];
                lista[i+1] = tmp;
            }
        }

        if (!houveTroca){
            break;
        }
        fim--;

        houveTroca = False;
        for (int i = fim; i > ini+1; i--){
            qtdComparacoes++;
            if (lista[i] < lista [i-1]){
                qtdTrocas++;
                houveTroca = True;
                tmp = lista [i];
                lista[i] = lista [i-1];
                lista[i-1] = tmp;
            }
        }
        ini++;

    } while (houveTroca);
}
```

```java
void agitacao(List<> lista) {
    boolean houveTroca;
    int tmp;
    int ini = 0;
    int fim = lista.size();
    int qtdComparacoes = 0, qtdTrocas = 0;

    do{
        houveTroca = false;
        for (int i = 0; i < fim-1; i++){
            qtdComparacoes++;
            if (lista.get(i) > lista.get(i+1)){
                qtdTrocas++;
                houveTroca = True;
                tmp = lista .get(i);
                lista.set(i, lista.get(i+1));
                lista.set(i+1, tmp);
            }
        }

        if (!houveTroca){
            break;
        }
        fim--;

        houveTroca = false;
        for (int i = fim; i > ini+1; i--){
            qtdComparacoes++;
            if (lista.get(i) < lista.get(i-1)){
                qtdTrocas++;
                houveTroca = True;
                tmp = lista .get(i);
                lista.set(i, lista.get(i+1));
                lista.set(i+1, tmp);
            }
        }
        ini++;

    } while (houveTroca);
}
```

5) PENTE - Comb sort
    -É baseado no Bolha,, ou seja, é uma tentativa de melhorar o Bolha.

    ATENÇÃO: a partir deste método, há COMPARAÇÕES a uma distância X. Isso gera uma pré-organização de comparações e trocas

    Instável
    Memória interna
    A estrutura possui 2 porções/partes (1ª é a ordenada; 2ª é a desordenada)

    Há variáveis  clássicas do bolha: i, houveTroca, tmp.
    Há a variável distância que é calculada pelo tamanho da estrutura dividido por 1.3

    Adequado somente para listas ou estruturas printas tipo lista de uma linguagem de programação

    n = 7
    0   1   2   3   4   5   6
    7   1   4   2   3   9   8   distância = (int)n / 1.3 = 5
    7   1   4   2   3   9   8   distância = (int) distância / 1.3 = 3
    2   1   4   7   3   9   8   distância = (int) distância / 1.3 = 2
    2   1   3   7   5   9   8   distância = (int) distância / 1.3 = 1
    1   2   3   4   7   8   9   distância = (int) distância / 1.3 = 1
    1   2   3   4   7   8   9

```c#
void pente(List<> lista) {
    bool houveTroca;
    int tmp;
    int distancia = lista.Count();
    int qtdComparacoes = 0, qtdTrocas = 0;

    do{
        distancia = (int) distancia / 1.3;
        if(distancia < 1){
            distancia = 1;
        }
        houveTroca = false;
        for (int i = 0; i+distancia < lista.Count(); i++){
            qtdComparacoes++;
            if (lista[i] > lista[i+distancia]){
                qtdTrocas++;
                houveTroca = True;
                tmp = lista[i];
                lista[i] = lista[i+distancia];
                lista[i+distancia] = tmp;
            }
        }
    } while (houveTroca || distancia > 1);
}
```

```java
void pente(List<> lista) {
    boolean houveTroca;
    int tmp;
    int distancia = lista.size();
    int qtdComparacoes = 0, qtdTrocas = 0;

    do{
        distancia = (int) distancia / 1.3;
        houveTroca = false;
        for (int i = 0; i+distancia < lista.size(); i++){
            qtdComparacoes++;
            if (lista.get(i) > lista[i+distancia]){
                qtdTrocas++;
                houveTroca = True;
                tmp = lista.get(i);
                lista.set(i, i+distancia);
                lista.set(i+distancia, tmp);
            }
        }
    } while (houveTroca || distancia > 1);
}
```

6) SHELLSORT 
É baseado no Inserção, ou seja, é uma tentativa de melhoria via o uso da ANÁLISE A DISTÂNCIA (tipo pente)
Instável 
Memória Interna

Não é adequado para listas encadeadas
n = 7
    0   1   2   3   4   5   6
    7   1   4   2   3   9   8   distância = 4
    3   1   4   2   7   9   8


```c#
void shell(List<> lista){
    int i, j;
    int tmp;
    int qtdComparacoes = 0, qtdTrocas = 0;
    int distancia = 1;

    int referenciaTamanho = 3;

    do{
        distancia = referenciaTamanho * distancia + 1;
    } while (distancia < n);
    /* n = 100
    referenciaTamanho = 3
    distancia = 3*1+1 = 4

    do {
        distancia = (int) distancia / referenciaTamanho;

        for (i = distancia, i < n, i++){
            tmp = vetor[i];
            for (j = i - distancia; j >= 0, j = j - distancia){
                qtdComparacoes++;
                if (tmp < vetor[j]){
                    vetor[j + distancia] = vetor[j];
                    qtdTrocas++;
                } else break;
            }
            vetor[j + distancia] = tmp;
            qtdTrocas++;
        }
    } while (distancia > 1);

}
```

7) QUICKSORT (usa o conceito dividir para conquistar)
faz parte de uma categoria de métodos de ordenação que utilizam a divisão da estrutura para acelerar a ordenação. Essa divisão é realizada por meio de RECURSÃO.
    - A estrutura possui 2 porções: parte esquerda e direita, divididas pelo PIVO. Pensar como se fosse uma ÁRVORE BINÁRIA desbalanceada
    - O método possui duas funções: quick (processo recursivo) e o particiona (posiciona/ordena o pivo)
   0    1    2    3    4    5    6    7    8
   30   90   10   20   80   10   20   40   10    ini = 0    fim = 8    pivo = 0/30
   10   90   10   20   80   10   20   40   30    ini = 1    fim = 8    pivo = 8/30
   10   30   10   20   80   10   20   40   90    ini = 1    fim = 7    pivo = 1/30
   10   20   10   20   80   10   30   40   90    ini = 4    fim = 7    pivo = 6/30
   10   20   10   20   30   10   80   40   90    ini = 4    fim = 5    pivo = 4/30
   10   20   10   20   10   30   80   40   90    ini = 5    fim = 5    pivo = 5/30
                            30
   10   20   10   20   10    ini = 0    fim = 4    pivo = 0/1
   10
        20   10   20   10    ini = 1    fim = 4    pivo = 1/20
        10   10   20   20    ini = 2    fim = 4    pivo = 4/20
                       20
        10   10   20         ini = 1    fim = 3    pivo = 1/10
                                 80   40   90    ini = 6    fim = 8    pivo = 6/80
                                 40   80   90    ini = 7    fim = 7    pivo = 7/80
   10   10   10   20   20   30   40   80   90

```c
int particiona(int *vetor, int ini, int fim) {
    int pivo;
    int tmp; //para as trocas

    pivo = ini; //na bibliografia do método, é possível ser o ini, o fim ou uma posição sorteada
    while (fim > ini) {

        //analise da direita para esquerda
        for (; fim > pivo && vetor[fim] > vetor[pivo]; fim--, qtd_comparacoes++); //garantindo que os maiores fiquem na direita

        if (fim > pivo) {
            qtdTrocas++;
            tmp = vetor[pivo];
            vetor[pivo] = vetor[fim];
            vetor[fim] = tmp;
            pivo = fim;
        }

        //analise da esquerda para direita
        for (ini++; ini < pivo && vetor[ini] < vetor[pivo]; ini++, qtdComparacoes++);

        if (ini < pivo) {
            qtdTrocas++;
            tmp = vetor[pivo];
            vetor[pivo] = vetor[ini];
            vetor[ini] = tmp;
            pivo = ini;
        }
    }
    return pivo;
}

void quickSort(int *vetor, int ini, int fim) { //método recurisivo baseado em árvore desbalanceada
    int pivo;

    pivo = particiona(vetor, ini, fim); //no final do particiona, o pivo está ordenado e é retornado a posição do pivo
    
    if (ini < pivo - 1) //tem lado esquerdo com mais de 1 elemento
        quickSort(vetor, ini, pivo - 1); //se existe lado esq do pivo, executa lado esq
    if (pivo + 1 < fim) //tem lado direito com mais de 1 elemento
        quickSort(vetor, pivo + 1, fim); //se existe lado dir do pivo, executa lado dir
}
```

```java
int particiona(int vetor[], int ini, int fim){
    int pivo;
    int tmp;

    pivo = ini;
    while (fim > ini) {

        //analise da direita para esquerda
        for (; fim > pivo && vetor[fim] > vetor[pivo]; fim--, qtd_comparacoes++); //garantindo que os maiores fiquem na direita

        if (fim > pivo) {
            qtdTrocas++;
            tmp = vetor[pivo];
            vetor[pivo] = vetor[fim];
            vetor[fim] = tmp;
            pivo = fim;
        }

        //analise da esquerda para direita
        for (ini++; ini < pivo && vetor[ini] < vetor[pivo]; ini++, qtdComparacoes++);

        if (ini < pivo) {
            qtdTrocas++;
            tmp = vetor[pivo];
            vetor[pivo] = vetor[ini];
            vetor[ini] = tmp;
            pivo = ini;
        }
    }
    return pivo;
}

void quickSort(int vetor[], int ini, int fim) { //método recurisivo baseado em árvore desbalanceada
    int pivo;

    pivo = particiona(vetor, ini, fim); //no final do particiona, o pivo está ordenado e é retornado a posição do pivo
    
    if (ini < pivo - 1){ //tem lado esquerdo com mais de 1 elemento
        quickSort(vetor, ini, pivo - 1); //se existe lado esq do pivo, executa lado esq
    }
    if (pivo + 1 < fim){ //tem lado direito com mais de 1 elemento
        quickSort(vetor, pivo + 1, fim); //se existe lado dir do pivo, executa lado dir
    }
}
```

```python
    def particiona(lista, ini, fim):
    
        pivo = lista[ini]   # escolhe o primeiro elemento como pivô
        i = ini + 1
        j = fim

        while i <= j:
            # anda da esquerda para a direita até achar alguém maior que o pivô
            while i <= fim and lista[i] <= pivo:
                Ordenacao.qtd_comparacoes += 1
                i += 1

            # anda da direita para a esquerda até achar alguém menor que o pivô
            while j > ini and lista[j] > pivo:
                Ordenacao.qtd_comparacoes += 1
                j -= 1

            if i < j:
                Ordenacao.qtd_trocas += 1
                lista[i], lista[j] = lista[j], lista[i]

        # coloca o pivô na posição correta
        Ordenacao.qtd_trocas += 1
        lista[ini], lista[j] = lista[j], lista[ini]

        return j  # posição final do pivô

    def quicksort(lista, ini, fim):
        if ini < fim:
            pivo = Ordenacao.particiona(lista, ini, fim)
            Ordenacao.quicksort(lista, ini, pivo - 1)
            Ordenacao.quicksort(lista, pivo + 1, fim)
```
        
8) HEAPSORT
Baseado na seleção, tem um desempenho em tempo de execução muito bom em conjuntos ordenados aleatoriamente.
    Estabilidade: instável
    Complexidade: O (n log n)
    O heapsort utiliza uma estrutura de dados chamada heap, para ordenar os elementos à medida que os insere na estrutura. Assim, ao final das inserções, os elementos podem ser sucessivamente removidos da raiz da heap, na ordem desejada, lembrando-se sempre de manter a propriedade de max-heap.
    A heap pode ser representada como uma árvore (uma árvore binária com propriedades especiais[1]) ou como um vetor. Para uma ordenação decrescente, deve ser construída uma heap mínima (o menor elemento fica na raiz). Para uma ordenação crescente, deve ser construído uma heap máxima (o maior elemento fica na raiz).

    R = raiz
    FE = Filho da esquerda    FE = R * 2
    FD = Filho da direita     FD = R * 2 + 1

    1    2    3    4    5    6    7
    15   7    4    8    12   1    3
    4    8    1    15   12   7    3
    1    8    3    15   12   7    4    - Heap máximo

```C
void heapsort(int a[], int n) {
   int i = n / 2, pai, filho, t;
   while(true) {
      if (i > 0) {
          i--;
          t = a[i];
      } else {
          n--;
          if (n <= 0) return;
          t = a[n];
          a[n] = a[0];
      }
      pai = i;
      filho = i * 2 + 1;
      while (filho < n) {
          if ((filho + 1 < n)  &&  (a[filho + 1] > a[filho]))
              filho++;
          if (a[filho] > t) {
             a[pai] = a[filho];
             pai = filho;
             filho = pai * 2 + 1;
          } else {
             break;
          }
      }
      a[pai] = t;
   }
}
```

```Java
public static void heapSort(int[] vetor){
        int tamanho = vetor.length;
        int i = tamanho / 2, pai, filho, t;
        while (true){
            if (i > 0){
                i--; t = vetor[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (vetor[filho + 1] > vetor[filho])) {filho++;}
                if (vetor[filho] > t){
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            vetor[pai] = t;
        }
    }
```
    
    


