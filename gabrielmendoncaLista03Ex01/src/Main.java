import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numero;
        System.out.print("Digite o seu número: ");
        numero =scan.nextDouble();
                                                
        if (numero <=1){
            System.out.print("f(x)= 1");
        } else if (numero >1 && numero <=2) {
            System.out.print("f(x)= 2");
        } else if (numero >2 && numero <=3) {
        numero *= numero;
            System.out.print("f(x)= " + numero);
        }else{
            numero *= numero*numero;
            System.out.print("f(x)= " + numero);
        }
    }
}