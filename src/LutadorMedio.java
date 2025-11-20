public class LutadorMedio extends Lutador {

    public LutadorMedio(String nome) {
        super(nome, 100, 80, 15);
    }

    @Override
    public void atacar(Lutador oponente) {
        int dano = this.forca;
        oponente.vida -= dano;
        System.out.println(nome + " atacou e causou " + dano + " de dano!");
    }

    @Override
    public void especial(Lutador oponente) {
        if (energia >= 30) {
            int dano = this.forca + 15;
            oponente.vida -= dano;
            energia -= 30;
            System.out.println(nome + " usou ESPECIAL e causou " + dano + " de dano!");
        } else {
            System.out.println(nome + " não tem energia!");
        }
    }

    @Override
    public void defender(Lutador oponente) {
        int dano = Math.max(0, oponente.forca - 10);
        vida -= dano;
        System.out.println(nome + " defendeu e recebeu " + dano + " de dano!");
    }
}
