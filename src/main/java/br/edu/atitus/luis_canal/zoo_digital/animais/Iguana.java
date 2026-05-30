package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.luis_canal.zoo_digital.especies.Reptil;

public final class Iguana extends Reptil implements Corrida {
    public Iguana(String nome, Integer idade, Boolean venenoso) {
        super(nome, idade, venenoso);
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo entre as pedras.");
    }

    @Override
    public void comer() {
        this.comer("folhas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está fazendo sons suaves.");
    }
}
