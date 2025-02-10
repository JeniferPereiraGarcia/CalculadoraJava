import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você deseja criar uma tabuada?");
        String resposta = scanner.next();

        while(resposta.equals("sim")){
            System.out.println("Qual tabuda você deseja criar?");
            int resposta2 = scanner.nextInt();
            for(int nr = 0; nr<= 10; nr++){
                System.out.println(resposta2 +"x"+ nr +"="+ resposta2*nr);
            }
            System.out.println("Deseja fazer uma nova tabuada?");
            resposta = scanner.next();
        }
        System.out.println("Obrigada!");
    }
}
