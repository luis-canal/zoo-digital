package br.edu.atitus.luis_canal.zoo_digital.especies;

public abstract class Peixe extends Animal {
    private String tipoAgua;

    public Peixe(String nome, Integer idade, String tipoAgua) {
        super(nome, "Peixe", idade);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}
