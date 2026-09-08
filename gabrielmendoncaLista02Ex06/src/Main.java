import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new  Scanner(System.in);
        int codigo;
        int quantidade;
        double valorUnidade = 0;
        double valorTotal;
        double desconto;
        double valorFinal;
        System.out.print("Digite o código do produto: ");
        codigo =scan.nextInt();
        System.out.print("Digite a quantidade: ");
        quantidade =scan.nextInt();
        
        if (codigo >=1 && codigo<=10){
            valorUnidade = 10;
        } else if (codigo >= 11 && codigo <=20) {
            valorUnidade = 15;
        } else if (codigo >=21 && codigo <=30) {
            valorUnidade = 20;
        } else if (codigo >=31 && codigo <=40) {
            valorUnidade = 30;
        }else{
            System.out.println("Opção inválida!");
        }

        valorTotal = valorUnidade * quantidade;

        if (valorTotal <=200){
            desconto = valorTotal *0.05;
        }else if (valorTotal >250 && valorTotal <=500){
            desconto = valorTotal *0.10;
        }else{
            desconto = valorTotal *0.15;
        }

        valorFinal = valorTotal - desconto;
        System.out.printf("Preço da unidade: R$ %.2f\n", valorUnidade);
        System.out.printf("Preço Total: R$ %.2f\n", valorTotal);
        System.out.printf("Valor do desconto: R$ %.2f\n", desconto);
        System.out.printf("O preço final foi: R$ %.2f\n", valorFinal);
    }
}