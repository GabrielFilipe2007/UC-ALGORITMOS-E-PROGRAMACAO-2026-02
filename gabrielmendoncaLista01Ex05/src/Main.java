import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura;
        double peso;
        double imc;

        System.out.print("Informe a sua altura em metros: ");
        altura = input.nextDouble();
        System.out.print("Informe o seu peso em kg: ");
        peso = input.nextDouble();

        imc = peso / (altura * altura);
        System.out.printf("O seu imc é: %.2f", imc);
    }
}