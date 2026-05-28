package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.interfaces.Corrida;
import br.edu.atitus.interfaces.Nado;

public final class Cachorro extends Mamifero implements Corrida, Nado {
    public Cachorro(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo e bagunçando o pátio!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando estilo cachorrinho!");
    }

    @Override
    public void comer() {
        this.comer("ração");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está latindo!");
    }

    
}