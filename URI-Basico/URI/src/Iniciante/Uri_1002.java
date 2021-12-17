package Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1002 {

    public static void main(String[] args) {
        double n = 3.14159;
        double raio;
        double area=1;
        Scanner ler = new Scanner(System.in);
        raio = ler.nextDouble();
        area= (raio) * (raio) * n;
        //DecimalFormat formato = new DecimalFormat("#.##");
        //area = Double.valueOf(formato.format(area));


        System.out.println("A=" + area);

    }
}
