package org.example.caxeirodijkstra;

import java.util.ArrayList;
import java.util.List;

public class CaxeiroViajante {
    private Grafo grafo;
    private Dijkstra dijkstra;

    public CaxeiroViajante(Grafo grafo) {
        this.grafo = grafo;
        this.dijkstra = new Dijkstra(grafo);
    }

    public void resolver() {
        int melhorCusto = Integer.MAX_VALUE;
        List<Integer> melhorRota = null;
        int melhorInicio = 0;

        for (int inicio = 1; inicio <= grafo.getNumVertices(); inicio++) {
            List<Integer> rota = new ArrayList<>();
            boolean[] visitado = new boolean[grafo.getNumVertices() + 1];
            int custoTotal = 0;
            int atual = inicio;

            rota.add(atual);
            visitado[atual] = true;

            for (int i = 1; i < grafo.getNumVertices(); i++) {
                int[] dist = dijkstra.executar(atual);

                int proximo = -1;
                int menorDist = Integer.MAX_VALUE;

                for (int v = 1; v <= grafo.getNumVertices(); v++) {
                    if (!visitado[v] && dist[v] < menorDist) {
                        menorDist = dist[v];
                        proximo = v;
                    }
                }

                if (proximo != -1) {
                    rota.add(proximo);
                    custoTotal += menorDist;
                    visitado[proximo] = true;
                    atual = proximo;
                }
            }

            int[] distRetorno = dijkstra.executar(atual);
            custoTotal += distRetorno[inicio];
            rota.add(inicio);

            if (custoTotal < melhorCusto) {
                melhorCusto = custoTotal;
                melhorRota = rota;
                melhorInicio = inicio;
            }
        }

        System.out.println("----- MELHOR SOLUÇÃO -----");
        System.out.println("Vértice inicial: " + melhorInicio);
        System.out.println("Custo total: " + melhorCusto);
        System.out.print("Rota: ");
        for (int i = 0; i < melhorRota.size(); i++) {
            System.out.print(melhorRota.get(i));
            if (i < melhorRota.size() - 1) System.out.print(" → ");
        }
    }
}
