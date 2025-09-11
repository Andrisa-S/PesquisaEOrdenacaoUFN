import java.util.List;

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
}
