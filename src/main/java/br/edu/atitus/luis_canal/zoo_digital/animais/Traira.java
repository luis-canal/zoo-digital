package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Nado;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.luis_canal.zoo_digital.especies.Peixe;

public final class Traira extends Peixe implements Nado, Predacao {
    public Traira(String nome, Integer idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando silenciosamente.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está emboscando pequenos peixes.");
    }

    @Override
    public void comer() {
        this.comer("peixes menores");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " não produz sons audíveis.");
    }
}
