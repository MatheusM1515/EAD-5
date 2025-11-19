abstract public class Lutador {
    // Criando a classe jogador
    String nome;
    int vida;
    int energia;
    int forca;

// Construção da Classe

    public Lutador(String nome, int vida, int energia, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.forca = forca;
    }

// Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida(){
        return vida;
    }

    public int getEnergia(){
        return energia;
    }

    public int getForca(){
        return forca;
    }


    abstract public void atacar(Lutador oponente);
    abstract public void especial(Lutador oponente);
    abstract public void defender(Lutador oponente);



    public void mostrarStatus() {

        System.out.println("Nome do Jogador: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Energia: " + this.energia);
        System.out.println("Força: " + this.forca);

    }

    public boolean estaVivo() {
        if (this.vida > 0) {
            System.out.println("Está Vivo");
            return true;
        } else {
            System.out.println("Está morto");
            return false;
        }

    }

}