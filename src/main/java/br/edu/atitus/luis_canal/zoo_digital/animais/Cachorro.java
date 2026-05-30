package br.edu.atitus.luis_canal.zoo_digital.animais;

import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Nado;
import br.edu.atitus.luis_canal.zoo_digital.comportamentos.Predacao;

import br.edu.atitus.luis_canal.zoo_digital.especies.Mamifero;

public final class Cachorro extends Mamifero implements Corrida, Nado, Predacao {
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
    public void cacar() {
        IO.println(this.getNome() + " está caçado um maldito gato cagão!");
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