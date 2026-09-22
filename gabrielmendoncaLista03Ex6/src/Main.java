import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        /*
       int senha = 0;
       int tentativa = 0;
        while (senha != 2026){
            System.out.print("Digite sua senha de 4 digitos: ");
            senha =scan.nextInt();
            if (senha != 2026){
                System.out.println("Senha incorreta! Tente novamente.");
            }else{
                System.out.println("Acesso autorizado!");
            }
            tentativa++;
        }
        System.out.println("Tentativas realizadas = " + tentativa);
        */
        //EXTRA

        String senha = "";
        int tentativa = 0;

        while (!senha.equals("2026")) {
            System.out.print("Digite sua senha de 4 digitos: ");
            senha = scan.nextLine();

            if (!senha.equals("2026")) {
                System.out.println("Senha incorreta! Tente novamente.");
            } else {
                System.out.println("Acesso autorizado!");
            }
              tentativa++;
        }
         System.out.println("Tentativas realizadas = " + tentativa);
    }
}