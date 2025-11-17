public class LutadorMedio extends Lutador {
    public LutadorMedio(String nome) {
        super(nome, 100, 100, 20);
    }

    @Override
    public void atacar(Lutador oponente) {
        oponente.vida -= 25;
        System.out.println("Lutador " + this.nome + "atacou o Oponente " + oponente.nome + "e " + oponente.nome + "ficou com " + oponente.vida + "de vida!");
    }

    @Override
    public void especial(Lutador oponente) {
        if (this.energia >= 30) {
            System.out.println("Lutador " + this.nome + "atacou o Oponente" + oponente.nome + "com o golpe especial, e " + oponente.nome + "ficou com " + oponente.vida);
        } else {
            System.out.println("Não tem energia o suficiente!");
        }

    }

    @Override
    public void defender(Lutador oponente){
        if(this.vida <= 60){
            System.out.println("O Lutador " + this.nome + "defendeu o golpe do " + oponente.nome + "e sua energia aumentou para " + this.energia + "de energia!" );
        }
    }
}


