package gradlegs;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public void setNome(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return cpf;
    }
}