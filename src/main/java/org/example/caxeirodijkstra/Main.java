package org.example.caxeirodijkstra;

public class Main {

    public static void main(String[] args) {
        Grafo grafo = new Grafo(18);

        grafo.adicionarAresta(1, 2, 20);
        grafo.adicionarAresta(1, 12, 29);
        grafo.adicionarAresta(1, 13, 37);
        grafo.adicionarAresta(1, 8, 29);
        grafo.adicionarAresta(2, 3, 25);
        grafo.adicionarAresta(2, 8, 28);
        grafo.adicionarAresta(2, 12, 39);
        grafo.adicionarAresta(3, 4, 25);
        grafo.adicionarAresta(3, 8, 30);
        grafo.adicionarAresta(3, 13, 54);
        grafo.adicionarAresta(4, 5, 39);
        grafo.adicionarAresta(4, 6, 32);
        grafo.adicionarAresta(4, 7, 42);
        grafo.adicionarAresta(4, 9, 23);
        grafo.adicionarAresta(4, 10, 33);
        grafo.adicionarAresta(4, 14, 56);
        grafo.adicionarAresta(5, 6, 12);
        grafo.adicionarAresta(5, 7, 26);
        grafo.adicionarAresta(5, 10, 19);
        grafo.adicionarAresta(6, 7, 17);
        grafo.adicionarAresta(6, 10, 35);
        grafo.adicionarAresta(6, 11, 30);
        grafo.adicionarAresta(7, 11, 38);
        grafo.adicionarAresta(8, 12, 25);
        grafo.adicionarAresta(8, 13, 22);
        grafo.adicionarAresta(9, 10, 26);
        grafo.adicionarAresta(9, 13, 34);
        grafo.adicionarAresta(9, 14, 56);
        grafo.adicionarAresta(9, 16, 43);
        grafo.adicionarAresta(10, 11, 24);
        grafo.adicionarAresta(10, 15, 30);
        grafo.adicionarAresta(10, 15, 19);
        grafo.adicionarAresta(11, 15, 26);
        grafo.adicionarAresta(11, 18, 36);
        grafo.adicionarAresta(12, 13, 27);
        grafo.adicionarAresta(12, 16, 43);
        grafo.adicionarAresta(13, 14, 24);
        grafo.adicionarAresta(13, 16, 19);
        grafo.adicionarAresta(14, 15, 20);
        grafo.adicionarAresta(14, 16, 19);
        grafo.adicionarAresta(14, 16, 17);
        grafo.adicionarAresta(15, 17, 18);
        grafo.adicionarAresta(15, 18, 21);
        grafo.adicionarAresta(16, 17, 26);
        grafo.adicionarAresta(17, 18, 15);

        System.out.println("Caxeiro Viajante usando Dijkstra");

        CaxeiroViajante tsp = new CaxeiroViajante(grafo);
        tsp.resolver();
    }
}

