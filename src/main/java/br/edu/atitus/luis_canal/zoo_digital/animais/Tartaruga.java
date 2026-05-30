package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Nado;
import br.edu.atitus.luis_canal.zoo_digital.especies.Reptil;

public final class Tartaruga extends Reptil implements Nado {
    public Tartaruga(String nome, Integer idade, Boolean venenoso) {
        super(nome, idade, venenoso);
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando tranquilamente.");
    }

    @Override
    public void comer() {
        this.comer("algas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está emitindo sons baixos.");
    }
}
