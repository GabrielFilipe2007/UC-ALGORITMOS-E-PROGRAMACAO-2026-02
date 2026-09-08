import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double valorRenda;
        double prestacaoMesal;
        double limitePrestacao;

        System.out.print("Digite o valor da renda mensal: ");
        valorRenda =scan.nextDouble();
        System.out.print("Digite o valor da prestação mensal desejada: ");
        prestacaoMesal =scan.nextDouble();

        limitePrestacao = valorRenda *0.30;

        if (prestacaoMesal > 3000.00 && valorRenda <10000.00){
            System.out.print("Financiamento negado por alta prestação!");
        }else if (prestacaoMesal > limitePrestacao){
            System.out.print("Financiamento negado por baixa renda.");
        }else{
            System.out.print("Financiamento aprovado!");
        }
    }
}