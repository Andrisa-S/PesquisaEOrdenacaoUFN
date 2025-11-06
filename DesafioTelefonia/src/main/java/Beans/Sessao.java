/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author laboratorio
 */
public class Sessao {
    private String numeroCelular;
    private String dadosSessao;

    public Sessao(String numeroCelular, String dadosSessao) {
        this.numeroCelular = numeroCelular;
        this.dadosSessao = dadosSessao;
    }

    @Override
    public String toString() {
        return "Sessao{" + "numeroCelular=" + numeroCelular + ", dadosSessao=" + dadosSessao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.numeroCelular);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sessao other = (Sessao) obj;
        return true;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getDadosSessao() {
        return dadosSessao;
    }

    public void setDadosSessao(String dadosSessao) {
        this.dadosSessao = dadosSessao;
    }
    
    
}
