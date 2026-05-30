package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Nado;
import br.edu.atitus.luis_canal.zoo_digital.especies.Peixe;

public final class PeixeMorcego extends Peixe implements Nado {
    public PeixeMorcego(String nome, Integer idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando próximo ao fundo do mar.");
    }

    @Override
    public void comer() {
        this.comer("pequenos invertebrados");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " permanece silencioso.");
    }
}
