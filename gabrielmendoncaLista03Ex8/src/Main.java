import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int quantidade;
        double valor;
        double totalValor = 0;
        double menorValor = 0;
        double maiorValor = 0;
        System.out.print("Digite a quantidade total de de doações recebidas no dia: ");
        quantidade =scan.nextInt();
        if (quantidade >0){
            for (int i = 1; i <= quantidade; i++){
                System.out.print("Digite o valor da doação " + i + " em R$: ");
                valor =scan.nextDouble();
                totalValor += valor;

                if (i == 1){
                    maiorValor = valor;
                    menorValor = valor;
                }else{
                    menorValor = Math.min(menorValor, valor);
                    maiorValor = Math.max(maiorValor, valor);
                }
            }
            System.out.printf("Valor total arrecadado: R$ %.2f\n", totalValor);
            System.out.printf("Maior valor individual doado: R$ %.2f\n", maiorValor);
            System.out.printf("Menor valor individual doado: R$ %.2f\n", menorValor);
        }else{
            System.out.println("Nenhuma doação registrada!");
        }
    }
}