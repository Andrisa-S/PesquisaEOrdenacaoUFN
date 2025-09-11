import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class principal {
    public static void main(String[] args) {
        List<Integer> listaBolha = new ArrayList<>();
        List<Integer> listaSelecao = new ArrayList<>();
        List<Integer> listaInsercao = new ArrayList<>();

        long tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int numero = (int) (Math.random() * 10000);
            listaBolha.add(numero);
            listaSelecao.add(numero);
            listaInsercao.add(numero);
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
    }
}
