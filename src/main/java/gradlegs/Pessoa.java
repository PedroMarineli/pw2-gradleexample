package gradlegs;

public abstract class Pessoa {
    private String nome;
    protected String mumRf;

    public abstract void setNumRf(String numRF);
    public abstract String getNumRf();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}