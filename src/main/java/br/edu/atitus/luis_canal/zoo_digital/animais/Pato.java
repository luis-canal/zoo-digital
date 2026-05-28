package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.comportamentos.Corrida;
import br.edu.atitus.comportamentos.Nado;
import br.edu.atitus.comportamentos.Voo;

public class Pato extends Ave implements Nado, Voo, Corrida {
    public Pato(String nome, String especie, int idade, String corPena) {
        super(nome, especie, idade, corPena);
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo.");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando.");
    }
}
