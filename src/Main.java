import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Lutador[] lutadores = new Lutador[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome de um jogador: ");
            String nome = sc.next();

            System.out.println("=============================");
            System.out.println("Escolha um tipo de Lutador: ");
            System.out.println("Digite 1 para Lutador Leve");
            System.out.println("Digite 2 para Lutador Médio");
            System.out.println("Digite 3 para Lutador Pesado");

            int tipo = sc.nextInt();

            Lutador lutador;

            switch (tipo) {
                case 1:
                    lutador = new LutadorLeve(nome);
                    break;

                case 2:
                    lutador = new LutadorMedio(nome);
                    break;

                case 3:
                    lutador = new LutadorPesado(nome);
                    break;

                default:
                    System.out.println("Tipo inválido! Criando lutador leve por padrão.");
                    lutador = new LutadorLeve(nome);
                    break;
            }
            lutadores[i] = lutador;

        }
        System.out.println("======== INICIANDO O COMBATE ========");
        Lutador p1 = lutadores[0];
        Lutador p2 = lutadores[1];

        while (p1.estaVivo() && p2.estaVivo()) {
            System.out.println("\nJogador 1: \nNome: " + p1.getNome() + "\nVida: " + p1.getVida() + "\nEnergia: " + p1.getEnergia() + "\nForça: " + p1.getForca());
            System.out.println();
            System.out.println("===============================");
            System.out.println("Escolha uma ação: ");
            System.out.println("1 - Atacar");
            System.out.println("2 - Usar especial");
            System.out.println("3 - Defender");

            int acao1 = sc.nextInt();

            switch (acao1) {
                case 1 -> p1.atacar(p2);
                case 2 -> p1.especial(p2);
                case 3 -> p1.defender(p2);
                default -> System.out.println("Opção invalida!");

            }

            if (!p2.estaVivo()) break;

            int acao2 = (int)(Math.random() * 3) + 1;
            System.out.println(p2.getNome() + " escolheu: " + acao2);

            switch (acao2){
                case 1 -> p2.atacar(p1);
                case 2 -> p2.especial(p1);
                case 3 -> p2.defender(p1);
            }


        }
    }
}