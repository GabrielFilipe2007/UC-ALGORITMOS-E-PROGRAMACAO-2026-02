import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int idade;
        double peso;
        double dosagemMg = 0;

        System.out.print("Digite a sua idade: ");
        idade =scan.nextInt();
        System.out.print("Digite o seu peso em kg :");
        peso =scan.nextDouble();

        if (idade >=12){
            if (peso >= 60.0){
                dosagemMg = 1000.0;
            }else{
                dosagemMg = 750.0;
            }
        }else{
            if(peso >= 5 && peso <=9){
                dosagemMg = 125.0;
            } else if (peso >=9.1 && peso <=16) {
                dosagemMg = 250.0;
            } else if (peso >= 16.1 && peso <=24) {
                dosagemMg = 375.0;
            } else if (peso >= 24.1 && peso <=30) {
                dosagemMg = 500.0;
            } else if (peso >30) {
                dosagemMg = 750.0;
            }
        }
            int gotas;
            gotas = (int) (dosagemMg * 20 /500);
            System.out.println("Idade do paciente: " + idade);
            System.out.printf("Peso do paciente: %.2f\n", peso);
            System.out.println("Você deve tomar: " + gotas + " gotas.");
    }
}