import java.util.Locale;
import java.util.Scanner;

public class Gerente {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int desconto = sc.nextInt();
        int precoAntigo = sc.nextInt();


        int precoNovo = precoAntigo - (precoAntigo * desconto / 100);
        System.out.println(precoNovo);

        sc.close();
    }
}