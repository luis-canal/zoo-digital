package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Nado;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.luis_canal.zoo_digital.especies.Reptil;

public final class Jacare extends Reptil implements Nado, Predacao {
    public Jacare(String nome, Integer idade, Boolean venenoso) {
        super(nome, idade, venenoso);
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando no rio.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está esperando uma presa se aproximar.");
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está emitindo um rugido grave.");
    }
}
