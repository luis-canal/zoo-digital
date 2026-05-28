package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.interfaces.Nado;

public final class Golfinho extends Mamifero implements Nado {
    public Golfinho(String nome, Integer idade) {
        super(nome, idade, false);
    }
    @Override
    public void comer() {
        this.comer("peixes");
    }
    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está assobiando!");
    }
    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando feliz da vida!");
    }
}