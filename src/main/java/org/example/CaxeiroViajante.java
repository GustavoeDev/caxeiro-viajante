package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CaxeiroViajante<K> {
    No<K> inicio;
    double melhorCusto = Double.MAX_VALUE;
    List<No<K>> melhorRota = new ArrayList<>();

    public CaxeiroViajante(No<K> inicio) {
        this.inicio = inicio;
    }

    public void gerarRotasPossiveis(Set<No<K>> todosNos) {
        List<No<K>> caminho = new ArrayList<>();
        caminho.add(inicio);

        Set<No<K>> visitados = new HashSet<>();
        visitados.add(inicio);

        gerarRecursivamente(inicio, visitados, caminho, todosNos, 0);
        System.out.println("\nMelhor rota: " + melhorRota + " | Custo total: " + melhorCusto);
    }

    private void gerarRecursivamente(No<K> atual, Set<No<K>> visitados, List<No<K>> caminho, Set<No<K>> todosNos, double custoAtual) {
        if (visitados.size() == todosNos.size()) {
            for (Ligacao<K> ligacao : atual.getLigacoes()) {
                if (ligacao.getDestino().equals(inicio)) {
                    double custoTotal = custoAtual + ligacao.getPeso();
                    System.out.println("Rota: " + caminho + " → " + inicio + " | Custo: " + custoTotal);

                    if (custoTotal < melhorCusto) {
                        melhorCusto = custoTotal;
                        melhorRota = new ArrayList<>(caminho);
                        melhorRota.add(inicio);
                    }
                    break;
                }
            }
            return;
        }

        for (Ligacao<K> ligacao : atual.getLigacoes()) {
            No<K> destino = ligacao.getDestino();
            if (!visitados.contains(destino)) {
                visitados.add(destino);
                caminho.add(destino);

                gerarRecursivamente(destino, visitados, caminho, todosNos, custoAtual + ligacao.getPeso());

                visitados.remove(destino);
                caminho.remove(caminho.size() - 1);
            }
        }
    }

}
