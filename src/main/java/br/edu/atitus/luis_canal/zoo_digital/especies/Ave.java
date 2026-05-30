package br.edu.atitus.luis_canal.zoo_digital.especies;
public abstract class Ave extends Animal{
    private String corPena;
    public Ave(String nome, String especie, int idade, String corPena) {
        super(nome, "Ave", idade);
        this.corPena = corPena;
    }
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
