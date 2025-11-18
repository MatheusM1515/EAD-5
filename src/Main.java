import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LutadorLeve[] lutadorLeve1 = new LutadorLeve[10];
        LutadorMedio[] lutadorMedio1 = new LutadorMedio[10];
        LutadorPesado[] lutadorPesado1 = new LutadorPesado[10];

        boolean repetir = true;

        System.out.println(" =================== MORTAL KOMBATE =================== ");

        while (repetir) {
            System.out.println("Escolha um Lutador?\n1 - Lutador Leve\n2 - Lutador Médio\n3 - Lutador Pesado\n4 - Encerrar");
            int escol = sc.nextInt();

            sc.nextLine();

            switch (escol) {
                case 1:
                    System.out.println("Digite o nome do Lutador: ");
                    String nomeLl = sc.nextLine();

                    for (int i = 0; i < lutadorLeve1.length; i++) {
                        if (lutadorLeve1[i] == null) {
                            lutadorLeve1[i] = new LutadorLeve(nomeLl);
                        break;
                    }
                    System.out.println(" ======================= Lutador Leve ======================= ");
                    System.out.println("Nome: " + lutadorLeve1[i].nome + "\nVida: " + lutadorLeve1[i].vida + "\nEnergia: " + lutadorLeve1[i].energia + "\nForça: " + lutadorLeve1[i].forca);
                    break;
                }

                case 2:
                    System.out.println("Digite o nome do Lutador: ");
                    String nomeLm = sc.nextLine();

                    for (int k = 0; k < lutadorMedio1.length; k++) {
                        if (lutadorMedio1[k] == null) {
                            break;
                    }

                    System.out.println(" ======================= Lutador Médio ======================= ");
                    System.out.println("Nome: " + lutadorMedio1[k].nome + "\nVida: " + lutadorMedio1[k].vida + "\nEnergia: " + lutadorMedio1[k].energia + "\nForça: " + lutadorMedio1[k].forca);
                    break;
                }

                case 3:
                    System.out.println("Digite o nome do Lutador: ");
                    String nomeLp = sc.nextLine();

                    for (int p = 0; p < lutadorMedio1.length; p++) {
                        if (lutadorMedio1[p] == null) {
                        break;
                    }

                    System.out.println(" ======================= Lutador Pesado ======================= ");
                    System.out.println("Nome: " + lutadorPesado1[p].nome + "\nVida: " + lutadorPesado1[p].vida + "\nEnergia: " + lutadorPesado1[p].energia + "\nForça: " + lutadorPesado1[p].forca);
                    break;
                }

                case 4:
                    repetir = false;
            }
            sc.nextLine();

        }

    }
}
