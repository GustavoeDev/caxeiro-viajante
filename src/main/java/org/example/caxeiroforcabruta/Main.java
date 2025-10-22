package org.example.caxeiroforcabruta;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        No<String> A = new No<>("A");
        No<String> B = new No<>("B");
        No<String> C = new No<>("C");
        No<String> D = new No<>("D");
        No<String> E = new No<>("E");

        A.adicionarLigacao(new Ligacao<>(B, 2));
        A.adicionarLigacao(new Ligacao<>(D, 3));
        A.adicionarLigacao(new Ligacao<>(E, 6));

        B.adicionarLigacao(new Ligacao<>(A, 2));
        B.adicionarLigacao(new Ligacao<>(C, 4));
        B.adicionarLigacao(new Ligacao<>(D, 3));

        C.adicionarLigacao(new Ligacao<>(B, 4));
        C.adicionarLigacao(new Ligacao<>(D, 7));
        C.adicionarLigacao(new Ligacao<>(E, 3));

        D.adicionarLigacao(new Ligacao<>(A, 3));
        D.adicionarLigacao(new Ligacao<>(B, 3));
        D.adicionarLigacao(new Ligacao<>(C, 7));
        D.adicionarLigacao(new Ligacao<>(E, 3));

        E.adicionarLigacao(new Ligacao<>(A, 6));
        E.adicionarLigacao(new Ligacao<>(C, 3));
        E.adicionarLigacao(new Ligacao<>(D, 3));

        Set<No<String>> todos = new HashSet<>(Arrays.asList(A, B, C, D, E));

        CaxeiroViajante<String> cv = new CaxeiroViajante<>(A);
        cv.gerarRotasPossiveis(todos);
    }
}