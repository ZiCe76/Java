package polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(70);
        
        Arroz a1 = new Arroz(0.400);

        Feijao f1 = new Feijao(0.100);

        Sorvete s1 = new Sorvete(0.500);

        System.out.println("O peso da pessoa eh: " + p1.getPeso());

        p1.comer(f1);
        p1.comer(s1);
        p1.comer(a1);

         System.out.println("O peso dinal da pessoa : " + p1.getPeso());


    }
}
