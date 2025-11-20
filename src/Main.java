import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static int lerInt(Scanner sc) {
        while (true) {
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Número invalido! digite apenas números.");
                sc.nextLine();
            }
        }
    }

    public static String lerNome(Scanner sc) {
        while (true) {
            String nome = sc.nextLine().trim();

            // + no final é FUNDAMENTAL para permitir várias letras
            if (nome.matches("[A-Za-zÀ-ÿ ]+")) {
                return nome;
            }

            System.out.println("Número invalido! Digite apenas letras:");
        }
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Lutador jogador;
        Lutador cpu;

        System.out.println("Digite o nome do 1° jogador:");
        String nome = lerNome(sc);

        System.out.println("Digite o nome do 2° jogador: ");
        String nomeCpu = lerNome(sc);

        System.out.println("==============================");
        System.out.println("Escolha o tipo de Lutador:");
        System.out.println("1 - Lutador Leve");
        System.out.println("2 - Lutador Médio");
        System.out.println("3 - Lutador Pesado");

        int tipo = lerInt(sc);

        switch (tipo) {
            case 1 -> jogador = new LutadorLeve(nome);
            case 2 -> jogador = new LutadorMedio(nome);
            case 3 -> jogador = new LutadorPesado(nome);
            default -> {
                System.out.println("Tipo inválido! Criando Lutador Leve.");
                jogador = new LutadorLeve(nome);
            }
        }


        int cpuTipo = (int)(Math.random() * 3) + 1;

        switch (cpuTipo) {
            case 1 -> cpu = new LutadorLeve(nomeCpu);
            case 2 -> cpu = new LutadorMedio(nomeCpu);
            case 3 -> cpu = new LutadorPesado(nomeCpu);
            default -> cpu = new LutadorLeve(nomeCpu);
        }

        System.out.println("\n======== INICIANDO O COMBATE ========");


        while (jogador.estaVivo() && cpu.estaVivo()) {


            System.out.println("\n========== STATUS ATUAL ==========");
            System.out.println("Jogador 1: ");
            jogador.mostrarStatus();
            System.out.println("---------------------------------");
            System.out.println("Jogador 2: ");
            cpu.mostrarStatus();
            System.out.println("=================================\n");


            System.out.println("Escolha sua ação:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Especial");
            System.out.println("3 - Defender");
            int acao = lerInt(sc);

            switch (acao) {
                case 1 -> jogador.atacar(cpu);
                case 2 -> jogador.especial(cpu);
                case 3 -> jogador.defender(cpu);
                default -> System.out.println("Ação inválida!");
            }


            if (!cpu.estaVivo()) break;


            int acaoCPU = (int)(Math.random() * 3) + 1;

            System.out.println("\n" + nomeCpu + " escolheu: " + acaoCPU);

            switch (acaoCPU) {
                case 1 -> cpu.atacar(jogador);
                case 2 -> cpu.especial(jogador);
                case 3 -> cpu.defender(jogador);
            }


            if (!jogador.estaVivo()) break;
        }

        System.out.println("\n==== FIM DO COMBATE ====");

        if (jogador.estaVivo()) {
            System.out.println(jogador.getNome() + " venceu!");
        } else {
            System.out.println( cpu.getNome() + " venceu!");
        }

        sc.close();
    }
}