package br.edu.atitus.luis_canal.zoo_digital.especies;

public abstract class Animal {

    public static int contadorAnimais = 0;

    public static int getContadorAnimais() {
        return contadorAnimais;
    }

    public final String VERSAO = "2.5";
    
    // Atributos
    private String nome;
    private String especie;
    private Integer idade;

    // Método Construtor
    public Animal(String nome, String especie, Integer idade){
        this.nome = nome; // Inicializa o atributo "nome" com o valor do parâmetro "nome"
        this.especie = especie;
        this.idade = idade;
        contadorAnimais++;
    }

    // Métodos Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void comer() {
        this.comer("alguma coisa");
    }

    public final void comer(String alimento) {
        IO.println(this.getNome() + " está comendo " + alimento);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "; Idade: " + this.getIdade() + " anos.";
    }


    public abstract void emitirSom();

    
}