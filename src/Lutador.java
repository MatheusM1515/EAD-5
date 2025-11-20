abstract public class Lutador {

    String nome;
    int vida;
    int energia;
    int forca;



    public Lutador(String nome, int vida, int energia, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.forca = forca;
    }



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
        return this.vida > 0;
    }
        }



