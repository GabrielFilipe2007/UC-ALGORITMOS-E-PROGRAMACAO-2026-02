import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Digite o primero número: ");
        a = input.nextInt();
        System.out.print("Digite o segundo número: ");
        b = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = input.nextInt();
        double resultado = a + b + c;
        System.out.println("A soma dos três números é: " + resultado);

        double media = resultado /3;

        System.out.printf("A média aritmética é: %.2f", media);

    }
}