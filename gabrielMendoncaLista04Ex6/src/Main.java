import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numeroSecreto=42;
        int palpite;
        int[] palpiteErrado = new int[0];

        System.out.print("Digite o seu palpite : ");
        palpite=scan.nextInt();
        while (palpite != numeroSecreto){
            palpiteErrado = Arrays.copyOf(palpiteErrado, palpiteErrado.length+1);
            palpiteErrado[palpiteErrado.length -1] = palpite;
            if (numeroSecreto > palpite){
                System.out.println("O número secreto é maior que " + palpite);
            }else{
                System.out.println("O número secreto é menor que " + palpite);
            }
            System.out.print("Digite um novo palpite: ");
            palpite=scan.nextInt();
        }
        System.out.println("Parabéns, você adivinhou! O número secreto é 42!");
        System.out.println("Tentativas: " + (palpiteErrado.length + 1));
        System.out.println("Palpites:");
        for (int i =0; i< palpiteErrado.length; i++){
            System.out.println((i+1) +  ") " + palpiteErrado[i]);
        }
        System.out.println((palpiteErrado.length + 1) + ") " + palpite);
    }
}