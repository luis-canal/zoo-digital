package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Nado;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.luis_canal.zoo_digital.especies.Ave;

public final class Pinguim extends Ave implements Nado, Corrida, Predacao {
    public Pinguim(String nome, String especie, int idade, String corPena) {
        super(nome, especie, idade, corPena);
    }
    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando entre os blocos de gelo.");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo desajeitadamente.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando krill no gelo.");
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está vocalizando.");
    }
}
