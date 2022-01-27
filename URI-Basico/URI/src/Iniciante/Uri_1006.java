package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Uri_1006 {
    public static void main(String[] args) throws IOException {
        double A;
        double B;
        double C;
        double media;
        Scanner ler = new Scanner(System.in);
        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();

        media = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.println(String.format("MEDIA = %.1f" , media));






    }
}
