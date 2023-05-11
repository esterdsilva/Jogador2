package br.com.fiap.Jogo;

public class Jogador {
    private String nome;
    private int xp;
    private int hp;
    private boolean envenenado;

    public Jogador() {
        this.nome = "Jogador";
        this.xp = 100;
        this.hp = 100;
        this.envenenado = false;
    }

    public Jogador(String nome) {
        this.nome = nome;
        this.xp = 100;
        this.hp = 100;
        this.envenenado = false;
    }

    public int getXp() {
        return this.xp;
    }

    public String getNome() {
        return this.nome;
    }

    public int getHp() {
        return this.hp;
    }

    public boolean isEnvenenado() {
        return this.envenenado;
    }

    public void receberDano(int pontos) {
        this.hp -= pontos;

        if (this.hp <= 0) {
            System.out.println("Game Over! Jogador " + this.nome + " foi derrotado.");
        }
    }

    public void receberCura(int pontos) {
        this.hp += pontos;
    }

    public void ganharExperiencia(int pontos) {
        this.xp += pontos;
    }

    public void receberAntidoto() {
        this.envenenado = !this.envenenado;
    }

    public void atacar(Jogador jogador) {
        int pontosDano = this.getXp();
        jogador.receberDano(pontosDano);

        if (jogador.getHp() <= 0) {
            this.ganharExperiencia(jogador.getXp());
        }
    }

	public int gety() {
		// TODO Auto-generated method stub
		return 0;
	}
}

