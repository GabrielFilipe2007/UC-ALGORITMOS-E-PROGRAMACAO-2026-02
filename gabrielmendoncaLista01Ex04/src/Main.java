import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor;
        double desconto;
        System.out.print("Informe o valor: ");
        valor = input.nextDouble();

        desconto = valor * 0.10;
        // OU ENTAO MULTIPLICAR POR 0.9
        double resultado;
        resultado = valor - desconto;
        System.out.printf("O valor com desconto é: " + resultado);
    }
}