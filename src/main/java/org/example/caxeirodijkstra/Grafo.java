package org.example.caxeirodijkstra;

public class Grafo {
    private int numVertices;
    private int[][] matriz;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        this.matriz = new int[numVertices + 1][numVertices + 1];
    }

    public void adicionarAresta(int origem, int destino, int peso) {
        matriz[origem][destino] = peso;
        matriz[destino][origem] = peso;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public int[][] getMatriz() {
        return matriz;
    }
}
