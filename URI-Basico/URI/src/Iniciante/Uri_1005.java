package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1005 {

    public static void main(String[] args) {
        double A;
        double B;
        double media;
        Scanner ler = new Scanner(System.in);
        //DecimalFormat deci = new DecimalFormat("0.00");

        A = ler.nextDouble();
        B = ler.nextDouble();

        media = ((A*3.5) + (B*7.5))/11;

        System.out.println(String.format("MEDIA = %.5f %n",media));
    }




}
