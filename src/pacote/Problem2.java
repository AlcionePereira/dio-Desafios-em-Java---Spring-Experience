package pacote;

import java.io.PrintStream;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();
        System.out.println("Vai ser " + casos + "casos");
        int cont = 0;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        double d = 0;
        double e = 0;
        double f = 0;

        double g = 0;
        double h = 0;
        double i = 0;

        while (cont < casos) {
            System.out.println("Digite a primeira sequencia de números:");
            a =  in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();

            System.out.println("Digite a segunda sequencia de números:");
            d = in.nextDouble();
            e = in.nextDouble();
            f = in.nextDouble();

            System.out.println("Digite a terceira sequencia de números:");
            g = in.nextDouble();
            h = in.nextDouble();
            i = in.nextDouble();

            cont = cont + 3;

        }
        double respostaA = ((a * 2) + (b * 3) + (c * 5))/ 10;
        double respostaB = ((d * 2 ) + (e * 3) + (f * 5)) / 10;
        double respostaC = ((g * 2) + (h * 3) + (i * 5)) / 10;

        System.out.printf("%.1f\n",  respostaA);
        System.out.printf("%.1f\n", respostaB);
        System.out.printf("%.1f\n",  respostaC);

    }
}

