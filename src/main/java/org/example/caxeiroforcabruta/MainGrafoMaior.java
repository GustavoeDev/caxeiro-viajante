package org.example.caxeiroforcabruta;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainGrafoMaior {
    public static void main(String[] args) {
        No<String> no1 = new No<>("A");
        No<String> no2 = new No<>("B");
        No<String> no3 = new No<>("C");
        No<String> no4 = new No<>("D");
        No<String> no5 = new No<>("E");
        No<String> no6 = new No<>("F");
        No<String> no7 = new No<>("G");
        No<String> no8 = new No<>("H");
        No<String> no9 = new No<>("I");
        No<String> no10 = new No<>("J");
        No<String> no11 = new No<>("K");
        No<String> no12 = new No<>("L");
        No<String> no13 = new No<>("M");
        No<String> no14 = new No<>("N");
        No<String> no15 = new No<>("O");
        No<String> no16 = new No<>("P");
        No<String> no17 = new No<>("Q");
        No<String> no18 = new No<>("R");

        no1.adicionarLigacao(new Ligacao<>(no2, 20));
        no2.adicionarLigacao(new Ligacao<>(no1, 20));

        no1.adicionarLigacao(new Ligacao<>(no12, 29));
        no12.adicionarLigacao(new Ligacao<>(no1, 29));

        no1.adicionarLigacao(new Ligacao<>(no13, 37));
        no13.adicionarLigacao(new Ligacao<>(no1, 37));

        no1.adicionarLigacao(new Ligacao<>(no8, 29));
        no8.adicionarLigacao(new Ligacao<>(no1, 29));

        no2.adicionarLigacao(new Ligacao<>(no3, 25));
        no3.adicionarLigacao(new Ligacao<>(no2, 25));

        no2.adicionarLigacao(new Ligacao<>(no8, 28));
        no8.adicionarLigacao(new Ligacao<>(no2, 28));

        no2.adicionarLigacao(new Ligacao<>(no12, 39));
        no12.adicionarLigacao(new Ligacao<>(no2, 39));

        no3.adicionarLigacao(new Ligacao<>(no4, 25));
        no4.adicionarLigacao(new Ligacao<>(no3, 25));

        no3.adicionarLigacao(new Ligacao<>(no8, 30));
        no8.adicionarLigacao(new Ligacao<>(no3, 30));

        no3.adicionarLigacao(new Ligacao<>(no13, 54));
        no13.adicionarLigacao(new Ligacao<>(no3, 54));

        no4.adicionarLigacao(new Ligacao<>(no5, 39));
        no5.adicionarLigacao(new Ligacao<>(no4, 39));

        no4.adicionarLigacao(new Ligacao<>(no6, 32));
        no6.adicionarLigacao(new Ligacao<>(no4, 32));

        no4.adicionarLigacao(new Ligacao<>(no7, 42));
        no7.adicionarLigacao(new Ligacao<>(no4, 42));

        no4.adicionarLigacao(new Ligacao<>(no9, 23));
        no9.adicionarLigacao(new Ligacao<>(no4, 23));

        no4.adicionarLigacao(new Ligacao<>(no10, 33));
        no10.adicionarLigacao(new Ligacao<>(no4, 33));

        no4.adicionarLigacao(new Ligacao<>(no14, 56));
        no14.adicionarLigacao(new Ligacao<>(no4, 56));

        no5.adicionarLigacao(new Ligacao<>(no6, 12));
        no6.adicionarLigacao(new Ligacao<>(no5, 12));

        no5.adicionarLigacao(new Ligacao<>(no7, 26));
        no7.adicionarLigacao(new Ligacao<>(no5, 26));

        no5.adicionarLigacao(new Ligacao<>(no10, 19));
        no10.adicionarLigacao(new Ligacao<>(no5, 19));

        no6.adicionarLigacao(new Ligacao<>(no7, 17));
        no7.adicionarLigacao(new Ligacao<>(no6, 17));

        no6.adicionarLigacao(new Ligacao<>(no10, 35));
        no10.adicionarLigacao(new Ligacao<>(no6, 35));

        no6.adicionarLigacao(new Ligacao<>(no11, 30));
        no11.adicionarLigacao(new Ligacao<>(no6, 30));

        no7.adicionarLigacao(new Ligacao<>(no11, 38));
        no11.adicionarLigacao(new Ligacao<>(no7, 38));

        no8.adicionarLigacao(new Ligacao<>(no12, 25));
        no12.adicionarLigacao(new Ligacao<>(no8, 25));

        no8.adicionarLigacao(new Ligacao<>(no13, 22));
        no13.adicionarLigacao(new Ligacao<>(no8, 22));

        no9.adicionarLigacao(new Ligacao<>(no10, 26));
        no10.adicionarLigacao(new Ligacao<>(no9, 26));

        no9.adicionarLigacao(new Ligacao<>(no13, 34));
        no13.adicionarLigacao(new Ligacao<>(no9, 34));

        no9.adicionarLigacao(new Ligacao<>(no14, 56));
        no14.adicionarLigacao(new Ligacao<>(no9, 56));

        no9.adicionarLigacao(new Ligacao<>(no16, 43));
        no16.adicionarLigacao(new Ligacao<>(no9, 43));

        no10.adicionarLigacao(new Ligacao<>(no11, 24));
        no11.adicionarLigacao(new Ligacao<>(no10, 24));

        no10.adicionarLigacao(new Ligacao<>(no14, 30));
        no14.adicionarLigacao(new Ligacao<>(no10, 30));

        no10.adicionarLigacao(new Ligacao<>(no15, 19));
        no15.adicionarLigacao(new Ligacao<>(no10, 19));

        no11.adicionarLigacao(new Ligacao<>(no15, 26));
        no15.adicionarLigacao(new Ligacao<>(no11, 26));

        no11.adicionarLigacao(new Ligacao<>(no18, 36));
        no18.adicionarLigacao(new Ligacao<>(no11, 36));

        no12.adicionarLigacao(new Ligacao<>(no13, 27));
        no13.adicionarLigacao(new Ligacao<>(no12, 27));

        no12.adicionarLigacao(new Ligacao<>(no16, 43));
        no16.adicionarLigacao(new Ligacao<>(no12, 43));

        no13.adicionarLigacao(new Ligacao<>(no14, 24));
        no14.adicionarLigacao(new Ligacao<>(no13, 24));

        no13.adicionarLigacao(new Ligacao<>(no16, 19));
        no16.adicionarLigacao(new Ligacao<>(no13, 19));

        no14.adicionarLigacao(new Ligacao<>(no15, 20));
        no15.adicionarLigacao(new Ligacao<>(no14, 20));

        no14.adicionarLigacao(new Ligacao<>(no16, 19));
        no16.adicionarLigacao(new Ligacao<>(no14, 19));

        no14.adicionarLigacao(new Ligacao<>(no17, 17));
        no17.adicionarLigacao(new Ligacao<>(no14, 17));

        no15.adicionarLigacao(new Ligacao<>(no17, 18));
        no17.adicionarLigacao(new Ligacao<>(no15, 18));

        no15.adicionarLigacao(new Ligacao<>(no18, 21));
        no18.adicionarLigacao(new Ligacao<>(no15, 21));

        no16.adicionarLigacao(new Ligacao<>(no17, 26));
        no17.adicionarLigacao(new Ligacao<>(no16, 26));

        no17.adicionarLigacao(new Ligacao<>(no18, 15));
        no18.adicionarLigacao(new Ligacao<>(no17, 15));

        Set<No<String>> todos = new HashSet<>(Arrays.asList(no1, no2, no3, no4, no5, no6, no7, no8, no9, no10, no11, no12, no13, no14, no15, no16, no17, no18));

        CaxeiroViajante<String> cv = new CaxeiroViajante<>(no1);
        cv.gerarRotasPossiveis(todos);
    }
}
