package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Nado;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Predacao;

import br.edu.atitus.luis_canal.zoo_digital.especies.Mamifero;

public final class Golfinho extends Mamifero implements Nado, Predacao {
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

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando um cardume de peixes!");
    }
}