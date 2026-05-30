package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.luis_canal.zoo_digital.especies.Mamifero;

public final class Leao extends Mamifero implements Corrida, Predacao {
    public Leao(String nome, Integer idade, Boolean temPelos) {
        super(nome, idade, temPelos);
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo pela savana.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando uma zebra.");
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está rugindo!");
    }
}
