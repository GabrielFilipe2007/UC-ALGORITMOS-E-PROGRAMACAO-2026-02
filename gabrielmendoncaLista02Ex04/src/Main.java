import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.print("Digite o primeiro numero: ");
        num1 =scan.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 =scan.nextInt();
        System.out.print("Digite o terceiro numero: ");
        num3 =scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.print("O maior número é " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("O maior número é " + num2);
        }else{
            System.out.print("O maior número é " + num3);
        }
    }
}