import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        boolean repetir = true;


        System.out.println("=================== MORTAL KOMBATE ===================");

        while (repetir) {
            System.out.println("Escolha um Lutador?\n1 - Lutador Leve\n2 - Lutador Médio\n3 - Lutador Pesado\n4 - Encerrar");
            int escol = sc.nextInt();

            sc.nextLine();

            switch (escol) {
                case 1:
                    System.out.println("Digite o nome do Lutador: ");
                    String nomeLl = sc.nextLine();
                    break;

                case 2:
                    System.out.println("Digite o nome do Lutador: ");
                    String nomeLm = sc.nextLine();
                    break;

                case 3:
                    System.out.println("Digite o nome do Lutador: ");
                    String nomeLp = sc.nextLine();
                    break;

                case 4:
                    repetir = false;
            }
        }



    }
}
