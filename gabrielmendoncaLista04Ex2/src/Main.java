import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double salario;
        int filhos;
        double mediaSalario;
        double mediaFilho;
        double salarioMinimo = 1700;
        double maiorSalario =0;
        double somaSalario = 0;
        double somaFilho = 0;
        int pessoaSalarioMinimo = 0;
        int quantidade = 0;
        int opcao;

        while (true) {
            System.out.print("Digite o seu sálario: ");
            salario = scan.nextDouble();
            System.out.print("Quantos filhos você tem: ");
            filhos = scan.nextInt();
            System.out.print("Digite 1 para continuar e 2 para parar.");
            opcao = scan.nextInt();
            quantidade++;
            somaSalario += salario;
            somaFilho += filhos;
            if (opcao == 2) {
                break;
            }
            if (salario <= salarioMinimo) {
                pessoaSalarioMinimo++;
            }
            if (quantidade == 1) {
                maiorSalario = salario;
            } else {
                maiorSalario = Math.max(maiorSalario, salario);
            }
        }
        mediaSalario = somaSalario /quantidade;
        mediaFilho = (double) somaFilho /quantidade;
        double percentualSalarioMinimo =
                (double) pessoaSalarioMinimo * 100 / quantidade;
        System.out.printf("A média do salário da população é: R$ %.2f\n", mediaSalario);
        System.out.printf("A média de filho da população é: %.2f\n", mediaFilho);
        System.out.println("O maior salário é: R$ " + maiorSalario);
        System.out.printf("O percentual de pessoas com até 1 salário mínimo é: %.2f", percentualSalarioMinimo);
    }
}