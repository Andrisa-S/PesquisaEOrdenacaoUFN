/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import pkg.Metodos;
/**
 *
 * @author laboratorio
 */
public class TesteString {
    public static void main(String[] args) {
        String string = new String();
        StringBuffer stringBuffer;
        StringBuilder stringBuilder = new StringBuilder();
        
        string = "turma de pesquisa e ordenação do curso de ordenação";
        //System.out.println(string.replace("ordenação", "ola")); //temporário, muda todas as palavras escolhidas
        //System.out.println(string); //volta a string original
        stringBuffer = new StringBuffer("Explicação sobre pesquisa digital");
        stringBuilder = new StringBuilder("Texto muito grande");
        
        System.out.println(string.indexOf("ordenação"));
        System.out.println(stringBuffer.indexOf("pesquisa"));
        System.out.println(stringBuilder.indexOf("muito"));
        
        //Inserção -> StringBuilder
        //Deleção -> StringBuffer
        //Substituição -> String
        //Fatia -> String
        
        /**/
        
        //Algoritmos genéticos
        //cromossomo - estado - objeto -> conjunto de genes
        //pai - "00000000001111111111"
        //mãe - "99999999997777777777"
        //filho1 - primeiraParteDoPai + segundaParteDaMae - 00000000007777777777
        //filho2 - primeiraParteDaMae + segundaParteDoPai - 99999999991111111111
        
        String pai = "77777779999999";
        String mae = "11111111110000000000";
        
        Metodos.cruzamentoGenetico(pai, mae);
    }
}
