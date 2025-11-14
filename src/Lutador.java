public abstract class Lutador {
    String nome;
    int vida;
    int energia;
    int forca;

    Lutador(String nome, int vida, int energia, int forca){
        this.nome = nome;
        this.vida = 100;
        this.energia = 100;
        this.forca = 30;
    }
    // métodos
    abstract public void atacar(Lutador oponente);

    abstract public void especial (Lutador oponente);


    public void defender(Lutador oponente){
        this.energia += 25;
            System.out.println("Lutador defendeu e recuperou " + this.energia + "de energia");

    }

    public void mostrarStatus(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Energia: " + this.energia);
    }

    public boolean estaVivo(){
        if (this.vida > 0){
            System.out.println("Jogador está vivo!");
            return true;
        } else{
            System.out.println("Jogador está morto!");
            return false;
        }
    }

}
