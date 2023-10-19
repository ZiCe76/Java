package array;

public class EqualHash {
    public static void main(String[] args) {
        Usuarios u1 = new Usuarios();
        u1.nome = "Pedro Silva";
        u1.email = "Pedrosilva@gmail.com";

        Usuarios u2 = new Usuarios();
        u2.nome = "Pedro Silva";
        u2.email = "Pedrosilva@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        
    }
    
}
