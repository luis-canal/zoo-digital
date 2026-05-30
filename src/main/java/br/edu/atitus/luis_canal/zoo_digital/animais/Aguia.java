package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Voo;
import br.edu.atitus.luis_canal.zoo_digital.especies.Ave;

public final class Aguia extends Ave implements Voo, Corrida, Predacao {
    public Aguia(String nome, String especie, int idade, String corPena) {
        super(nome, especie, idade, corPena);
    }

    @Override
    public void voar() {
        IO.println(getNome() + " está voando em grandes altitudes.");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo pelo solo.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando um coelho.");
    }

    @Override
    public void comer() {
        this.comer("pequenos animais");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está emitindo um grito agudo.");
    }
}
