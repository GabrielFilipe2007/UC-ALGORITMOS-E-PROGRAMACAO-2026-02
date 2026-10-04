import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long numero;
        System.out.print("Digite um número: ");
        numero = scan.nextInt();
        long fatorial =1;
        for (long i =numero; i>=1; i--){
            fatorial *=i;
        }
        System.out.println("o fatorial é:" + fatorial);
    }
}
