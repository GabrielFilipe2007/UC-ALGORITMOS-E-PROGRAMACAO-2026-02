import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int numero;
        System.out.print("Informe um número: ");
        numero =scan.nextInt();
        for (int i =1; i <=10; i++ ){
            int resultado;
            resultado = numero * i;
            System.out.println("Tabuada de 1 a 10 do " + numero + ": " + resultado);
        }
    }
}