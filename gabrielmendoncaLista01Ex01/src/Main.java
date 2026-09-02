import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero;

        System.out.print("Digite um número: ");
        numero = input.nextDouble();
        numero *= 2;

    System.out.println("O dobro do seu número é: " + numero + ".");
    }
}