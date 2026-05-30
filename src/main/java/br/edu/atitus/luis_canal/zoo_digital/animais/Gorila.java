package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.luis_canal.zoo_digital.especies.Mamifero;

public final class Gorila extends Mamifero implements Corrida {
    public Gorila(String nome, Integer idade, Boolean temPelos) {
        super(nome, idade, temPelos);
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está pulando entre as árvores.");
    }

    @Override
    public void comer() {
        this.comer("frutas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está gritando.");
    }
}
