package encapsulamento;

public class Pessoa {
    
    private int idade;
    private String nome;

    public Pessoa(String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }

    // getter
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    // setter
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120){
        this.idade = novaIdade;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "ola eu sou o "+ getNome() + " tenho " + getIdade() + " anos.";
    }
}
