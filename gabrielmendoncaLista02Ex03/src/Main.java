import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int numero;

        System.out.print("Insira um número: ");
        numero = scan.nextInt();
        if (numero % 2 == 0){
            System.out.println("Seu número é par.");
            numero *= numero;
            System.out.print("O dobro do seu é: " + numero);
        }else{
            System.out.println("Seu número é impar.");
            numero *= numero * numero;
            System.out.print("O triplo do seu número é: " + numero);
        }
    }
}