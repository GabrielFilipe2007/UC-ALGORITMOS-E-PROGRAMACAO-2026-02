import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int idade;
        System.out.print("Digite a sua idade: ");
        idade =scan.nextInt();

        if (idade >= 18){
            System.out.print("Você é da categoria adulto!");
        } else if (idade <=12) {
            System.out.print("Você é da categoria infantil!");
        }else{
            System.out.print("Você é da categoria juvenil!");
        }
    }
}