package org.example;

public class Ligacao<K> {

    No<K> destino;
    double peso;

    public Ligacao(No<K> destino, double peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public No<K> getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

}
