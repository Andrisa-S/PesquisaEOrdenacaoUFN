/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.HashMap;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
        HashMap<String, Sessao> sessoes = new HashMap<>();
        
        Sessao sessao1 = new Sessao("123456789", "Dados da Sessão 1");
        Sessao sessao2 = new Sessao("123456788", "Dados da Sessão 2");
        Sessao sessao3 = new Sessao("987654321", "Dados da Sessão 3");
        
        sessoes.put(sessao1.getNumeroCelular(), sessao1);
        sessoes.put(sessao2.getNumeroCelular(), sessao2);
        sessoes.put(sessao3.getNumeroCelular(), sessao3);
        
        String celularBusca = "123456879";
        
        Sessao sessaoEncontrada = sessoes.get(celularBusca);
        
        if (sessaoEncontrada != null){
            System.out.println("Sessão encontrada: " + sessaoEncontrada.getDadosSessao());   
        } else {
            System.out.println("Sessão não encontrada.");
        }
        
    }
}
