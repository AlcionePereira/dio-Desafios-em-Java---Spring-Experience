package pacote;

import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        double salario = 0.0;
        double totSalario = 0.0;
        double acrescimo = 0.0;
        System.out.println("Qual o nome do Funcionário?");
        nome = sc.next();
        System.out.println("Entre com valor do Salário");
        salario = sc.nextDouble();

        if (salario <= 150){
            acrescimo = salario * 0.25;
            totSalario = salario + acrescimo;
        }
        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+totSalario);
    }
}