import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int peso;
        int pesoReferencia;
        int quantidadeIgual = 0;
        String [] caixa={"Caixa 1", "Caixa 2", "Caixa 3", "Caixa 4", "Caixa 5", "Caixa 6"};
        int n [] = new int[6];
        for (int i=0; i<6; i++){
            System.out.print("Digite o peso da " + caixa[i] + " : ");
            peso =scan.nextInt();
            n[i] =peso;
        }
        System.out.print("Digite o peso de referência: ");
        pesoReferencia =scan.nextInt();
        for (int i=0; i<6; i++){
            if (n[i] == pesoReferencia){
                System.out.println("O peso ficou igual ao de referência na " + caixa[i] + ".");
                quantidadeIgual++;
            }
        }
        if (quantidadeIgual == 0){
            System.out.println("Valor não localizado na amostragem!");
        }
    }
}