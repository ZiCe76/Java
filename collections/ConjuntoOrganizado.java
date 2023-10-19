import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrganizado {
    public static void main(String[] args){

       // Set<String> lista = new HashSet<>();
       SortedSet<String> lista = new TreeSet<>();

        lista.add("denis");
        lista.add("tenis");
        lista.add("genis");
        lista.add("benis");

        for(String nome: lista) {
            System.out.println(nome);
        } 
    }
}
