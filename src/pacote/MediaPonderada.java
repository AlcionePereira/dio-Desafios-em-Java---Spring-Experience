package pacote;
import java.util.*;

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 */

import java.text.DecimalFormat;

public class MediaPonderada{

    public static void main(String[] args)

    {

        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();

        int cont = 0;

        while (cont < casos){

            double a = input.nextDouble();

            double b = input.nextDouble();

            double c = input.nextDouble();

            double mediaPonderada= ((a*2)+(b*3)+(c*5))/10;

            System.out.println(String.format("%.1f", mediaPonderada));

            cont++;

        }
    }

}