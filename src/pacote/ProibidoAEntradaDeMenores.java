package pacote;

import java.util.*;

public class ProibidoAEntradaDeMenores {
       public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
        double[] idade = new double[N];

        for(int i =0; i < N; i++){
            idade[i] = scan.nextInt();
        }
        System.out.println("Nao poderao entrar as idades:");
        for(int j = 0; j< N; j++){
            if(idade[j] < 18){
                System.out.println(((int)idade[j]));
            }
        }
        }
    }