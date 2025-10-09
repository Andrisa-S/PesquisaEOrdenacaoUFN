/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

/**
 *
 * @author laboratorio
 */
public class Metodos {
    public static void cruzamentoGenetico (String pai, String mae){
        int tamPai = pai.length(); //tamanho genetico do pai
        int tamMae = mae.length(); //tamanho genetico da mãe
        
        String met1Pai = pai.substring(0, (tamPai/2)); //primeira metade do pai
        String met1Mae = mae.substring(0, (tamMae/2)); //primeira metade da mãe
        String met2Pai = pai.substring(tamPai/2); //segunda metade do pai
        String met2Mae = mae.substring(tamMae/2); //segunda metade da mãe
        
        String filho1 = met1Pai + met2Mae;
        String filho2 = met1Mae + met2Pai;
        
        System.out.println("Filho 1: " + filho1);
        System.out.println("Filho 2: " + filho2);
    }
}
