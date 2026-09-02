import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        double porcentagem;
        double aumento;
        double reajuste;

        System.out.print("Digite o valor do seu salário: ");
        salario = input.nextDouble();
        System.out.print("Digite a porcentagem de aumento(apenas o número): ");
        porcentagem = input.nextDouble();

        aumento = (porcentagem/100) * salario;
        System.out.println("O aumento concedido é de: " + aumento);
      reajuste = salario + aumento;
        System.out.printf("O valor do novo salário é: R$ %.2f", reajuste);
    }
}