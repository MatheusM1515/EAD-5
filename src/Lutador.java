public abstract class Lutador {
    String nome;
    int vida;
    int energia;
    int forca;

    Lutador(String nome, int vida, int energia, int forca){
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.forca = forca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    // métodos
    abstract public void atacar(Lutador oponente);

    abstract public void especial (Lutador oponente);

    abstract public void defender(Lutador oponente);



    public void mostrarStatus(){
        System.out.println("===============================");
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
