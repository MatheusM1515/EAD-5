public class LutadorLeve extends Lutador {
    public LutadorLeve(String nome) {
        super(nome, 80, 100, 10);
    }

    @Override
    public void atacar(Lutador oponente) {
        oponente.vida -= 15;
        System.out.println("Lutador " + this.nome + "atacou o Oponente " + oponente.nome + "rapidamente e " + oponente.nome + "ficou com " + oponente.vida + "de vida!");
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