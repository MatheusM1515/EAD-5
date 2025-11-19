public class LutadorLeve extends Lutador {

    public LutadorLeve(String nome) {
        super(nome, 80, 100, 10); // vida, energia, força
    }

    @Override
    public void atacar(Lutador oponente) {
        int dano = this.forca;
        oponente.vida -= dano;
        System.out.println(nome + " atacou e causou " + dano + " de dano!");
    }

    @Override
    public void especial(Lutador oponente) {
        if (energia >= 20) {
            int dano = this.forca + 10;
            oponente.vida -= dano;
            energia -= 20;
            System.out.println(nome + " usou ESPECIAL e causou " + dano + "!");
        } else {
            System.out.println(nome + " não tem energia para especial!");
        }
    }

    @Override
    public void defender(Lutador oponente) {
        int dano = Math.max(0, oponente.forca - 5);
        vida -= dano;
        System.out.println(nome + " defendeu e recebeu " + dano + " de dano reduzido!");
    }
}