import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double consumo;

        System.out.print("Digite a quantida de KWh consumido: ");
        consumo = scan.nextDouble();
        if (consumo <= 100){
            consumo *= 0.5;
            System.out.print("O valor da conta de energia é R$" + consumo);
        } else if (consumo <=200){
            consumo *=0.7;
            System.out.print("O valor da conta de energia é R$" + consumo);
        }else{
            consumo *=0.9;
            System.out.print("O valor da conta de energia é R$" + consumo);
        }
    }
}