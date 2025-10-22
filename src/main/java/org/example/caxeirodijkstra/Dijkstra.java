package org.example.caxeirodijkstra;

public class Dijkstra {
    private static final int INFINITO = 999999;
    private Grafo grafo;

    public Dijkstra(Grafo grafo) {
        this.grafo = grafo;
    }

    public int[] executar(int origem) {
        int n = grafo.getNumVertices();
        int[][] mat = grafo.getMatriz();

        int[] L = new int[n + 1];
        int[] A = new int[n + 1];
        boolean[] M = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            L[i] = INFINITO;
            A[i] = -1;
            M[i] = false;
        }

        L[origem] = 0;
        int vert = origem;

        while (vert != -1) {
            for (int i = 1; i <= n; i++) {
                if (mat[vert][i] != 0 && !M[i]) {
                    int novaDist = L[vert] + mat[vert][i];
                    if (novaDist < L[i]) {
                        L[i] = novaDist;
                        A[i] = vert;
                    }
                }
            }

            M[vert] = true;

            int min = INFINITO;
            vert = -1;
            for (int i = 1; i <= n; i++) {
                if (!M[i] && L[i] < min) {
                    min = L[i];
                    vert = i;
                }
            }
        }

        return L;
    }
}

