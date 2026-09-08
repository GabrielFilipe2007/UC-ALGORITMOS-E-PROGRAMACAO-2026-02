import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double graus;
        int opcao;
        double fahrenheit;
        double kelvin;

        System.out.print("Insira o graus celsius que deseja converter: ");
        graus = scan.nextDouble();
        System.out.println("Você quer converter para qual unidade: \n 1)Fahrenheit \n 2)Kelvin\n");
        opcao = scan.nextInt();
        if (opcao == 1){
            fahrenheit = graus * 1.8 + 32;
            System.out.println("Convertendo fica: " + fahrenheit + " fahrenheit.");
        } else if (opcao == 2) {
            kelvin = graus + 273.15;
            System.out.println("Convertendo fica: " + kelvin + " kelvin.");
        }else{
            System.out.println("Opção inválida!");
        }
    }
}