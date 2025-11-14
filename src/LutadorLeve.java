public class LutadorLeve extends Lutador{
    public LutadorLeve(String nome, int vida, int energia, int forca){
        super(nome, 100, 100,10 );
    }
    @Override
    public void atacar(Lutador oponente){
        oponente.vida -=30;
        System.out.println("Lutador " + this.nome + "atacou " + oponente.nome + "ficou com " + oponente.vida + "de vida");
    }

    @Override
    public void especial (Lutador oponente){
        this.energia -= 20;
        oponente.vida -= 15;
        System.out.println("Lutador " + this.nome + "atacou " + oponente.nome + "com o golpe especial " +  this.energia );
    }

}
