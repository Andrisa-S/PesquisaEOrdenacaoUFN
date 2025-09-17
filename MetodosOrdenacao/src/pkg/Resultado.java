/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

/**
 *
 * @author parks
 */
public class Resultado {
    private String metodo;
    private int comparacoes;
    private int trocas;
    private long tempo; // ms

    public Resultado(String metodo, int comparacoes, int trocas, long tempo) {
        this.metodo = metodo;
        this.comparacoes = comparacoes;
        this.trocas = trocas;
        this.tempo = tempo;
    }

    public String getMetodo() { return metodo; }
    public int getComparacoes() { return comparacoes; }
    public int getTrocas() { return trocas; }
    public long getTempo() { return tempo; }
}
