import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Digite um número: ");
        a = input.nextInt();
        System.out.print("Digite outro número: ");
        b = input.nextInt();
        System.out.println("O primeiro número digitado foi: " + a + " o segundo número digitado foi " + b);

        int c =a;
        a = b;
        b = c;

        System.out.println("Agora o primeiro número é " + a + " O segundo número agora é " + b);
    }
}