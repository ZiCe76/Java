package encapsulamento;

public class TestePessoa {
    
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedro", 30);
        p1.setIdade(30); // alterar

        System.out.println(p1); // ler
    }
}
