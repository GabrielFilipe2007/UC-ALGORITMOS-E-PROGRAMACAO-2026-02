import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int somaTemperatura = 0;
        int mediaTemperatura;
        int temperatura;
        int quantidade = 0;
        String[] diaSemana ={"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" };
        int n [] = new int[5];
        for (int i=0; i<5; i++){
            System.out.print("Informe a temperatura de " + diaSemana[i] + ": ");
            temperatura =scan.nextInt();
            n[i] = temperatura;
            quantidade++;
            somaTemperatura+= temperatura;
        }
        mediaTemperatura= somaTemperatura/quantidade;
        System.out.println("A temperatura média da semana foi: " + mediaTemperatura + "°C");
        System.out.println("Dias com temperatura acima da media: ");
        for (int i=0; i<5; i++){
            if (n[i] > mediaTemperatura){
                System.out.println("- " + diaSemana[i] + " (" + n[i] + "°C)");
            }
        }

    }
}