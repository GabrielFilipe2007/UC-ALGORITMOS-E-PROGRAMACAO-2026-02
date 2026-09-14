import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double valorA;
        double valorB;
        double valorC;

        System.out.print("Digite o valor de a: ");
        valorA =scan.nextDouble();
        if (valorA == 0){
            System.out.print("A = 0 não é equação de segundo grau!");
        }else{
            System.out.print("Digite o valor de b: ");
            valorB =scan.nextDouble();
            System.out.print("Digite o valor de c: ");
            valorC =scan.nextDouble();

            double delta;
            double raiz1;
            double raiz2;

            delta = (valorB*valorB) - (4*valorA*valorC);
            System.out.printf("O valor de delta é: %.2f", delta );
            if (delta <0){
                System.out.println("Delta <0 não existe raíz real!");
            } else if (delta >0) {
                raiz1 = (-valorB + Math.sqrt(delta)) / (2*valorA);
                raiz2 = (-valorB - Math.sqrt(delta)) / (2*valorA);
                System.out.println("\nComo delta >0 existe duas raízes reais diferentes: ");
                System.out.printf("Raíz 1: %.2f", raiz1);
                System.out.printf("\nRaíz 2: %.2f", raiz2);
            }else{
                double raiz;
                raiz = -valorB / (2*valorA);
                System.out.println("\nDelta =0, logo são duas raízes iguais:");
                System.out.printf("Raíz = %.2f", raiz);
            }
        }
    }
}