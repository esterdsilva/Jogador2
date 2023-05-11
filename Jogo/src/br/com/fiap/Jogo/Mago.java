package br.com.fiap.Jogo;

public class Mago extends Jogador implements Visualizavel {
    private int x;
    private int y;
    private int mp;

    public Mago() {
        super();
        this.mp = 100;
        this.x = 0;
        this.y = 0;
    }

    public Mago(String nome) {
        super(nome);
        this.mp = 100;
        this.x = 0;
        this.y = 0;
    }


	public void ataqueMago(Jogador jogador) {
        if (this.mp >= 10) {
            jogador.receberDano(this.getMp() * 2);
            this.mp -= 10;
        }
        if (jogador.getHp() <= 0) {
            this.ganharExperiencia(jogador.getXp());
            this.mp = 100;
        }
    }

    public void trocarVida(int hp) {
        if (this.getHp() > hp) {
            this.receberDano(hp);
            this.mp += hp;
        }
    }

    public int getMp() {
        return mp;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}
