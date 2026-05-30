package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Nado;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.luis_canal.zoo_digital.especies.Reptil;

public final class Cobra extends Reptil implements Nado, Predacao {
    public Cobra(String nome, Integer idade, Boolean venenoso) {
        super(nome, idade, venenoso);
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está deslizando pela água.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando um ratão.");
    }

    @Override
    public void comer() {
        this.comer("pequenos animais");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está sibilando.");
    }
}
