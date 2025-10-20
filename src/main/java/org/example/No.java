package org.example;

import java.util.ArrayList;
import java.util.List;

public class No<K> {

    K key;
    List<Ligacao<K>> ligacoes = new ArrayList<>();

    public No(K key) {
        this.key = key;
    }

    public void adicionarLigacao(Ligacao<K> ligacao) {
        ligacoes.add(ligacao);
    }

    public List<Ligacao<K>> getLigacoes() {
        return ligacoes;
    }

    @Override
    public String toString() {
        return key.toString();
    }

}
