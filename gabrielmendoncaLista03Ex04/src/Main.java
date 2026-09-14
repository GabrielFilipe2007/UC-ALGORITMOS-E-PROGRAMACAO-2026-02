import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.print("Digite o número do mês: ");
        numero =scan.nextInt();

        switch (numero){
            case 1:
                System.out.print("O mês é janeiro.");
                break;
            case 2:
                System.out.print("O mês é fevereiro.");
                break;
            case 3:
                System.out.print("O mês é março.");
                break;
            case 4:
                System.out.print("O mês é abril.");
                break;
            case 5:
                System.out.print("O mês é maio.");
                break;
            case 6:
                System.out.print("O mês é junho.");
                break;
            case 7:
                System.out.print("O mês é julho.");
                break;
            case 8:
                System.out.print("O mês é agosto.");
                break;
            case 9:
                System.out.print("O mês é setembro.");
                break;
            case 10:
                System.out.print("O mês é outubro.");
                break;
            case 11:
                System.out.print("O mês é novembro.");
                break;
            case 12:
                System.out.print("O mês é dezembro.");
                break;
            default:
                System.out.print("Opção inválida!");
        }
    }
}