package array;

public class Usuarios {
    String nome;
    String email;

    public boolean equals(Object objeto) {

            Usuarios outro = (Usuarios) objeto;
            

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        
    }
}
