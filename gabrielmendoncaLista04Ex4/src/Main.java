import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double valorVenda;
        double valorTotal=0;
        double media;
        int quantidade=0;
        String[] diaSemana ={"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
        int n[] =new int[5];
        for (int i =0; i<5; i++){
            System.out.print("Digite o valor da venda de " + diaSemana[i] + ": ");
            valorVenda =scan.nextDouble();
            n[i] = (int) valorVenda;
            quantidade++;
            valorTotal+=valorVenda;
        }
        media= valorTotal/quantidade;
        System.out.printf("O faturamento total foi de R$: %.2f\n", valorTotal);
        System.out.printf("A média diária é de R$: %.2f\n", media);
        System.out.println("Ficou abaixo da média nos dias:");
        for (int i=0; i<5; i++){
            if (n[i] < media){
                System.out.println("- " + diaSemana[i] + " com R$: " + n[i]);
            }
        }
    }
}