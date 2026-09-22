import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double nota;
        double quantidade = 0;
        double soma = 0;
        double media;

        System.out.println("Digite uma nota positiva dos alunos, para  encerrar o programa " +
                "informe um valor negativo.");
        while (true){
            System.out.print("Digite uma nota: ");
            nota =scan.nextDouble();

            if (nota <0){
                break;
            }
            soma += nota;
            quantidade++;
        }
        if (quantidade >0) {
            media = soma/quantidade;
            System.out.println("Quantidade de notas: " + quantidade);
            System.out.printf("A média aritmética é: %.2f\n", media);
        }else{
            System.out.println("Nenhuma nota válida digitada!");
        }
    }
}