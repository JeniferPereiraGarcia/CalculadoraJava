import java.util.Scanner;

public class EmDoWhile {
    public static void main (String[]args) {
        Scanner s = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.println("Qual tabuada você deseja?");
            int num = s.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + "x" + i + "=" + num * i);
            }
            System.out.println("Deseja uma nova tabuada?");
            resposta = s.next();
        }while (resposta.equals("sim"));

        System.out.println("Obrigada!");
    }
}
