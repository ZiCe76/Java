import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) { 
    HashSet conjunto = new HashSet();

    conjunto.add(1.2); // double -> Classe Double
    conjunto.add(true); // boolean -> Boolean
    conjunto.add("teste"); // String
    conjunto.add(1); // int -> Integrer
    conjunto.add('X'); // char -> Caracter

    System.out.println("tamanho : " + conjunto.size());

    Set nums = new HashSet();

    nums.add(1);
    nums.add(2);
    nums.add(3);

    System.out.println(nums);
    System.out.println(conjunto);

    conjunto.addAll(nums); // uniao de conjuntos

    System.out.println("tamanho : " + conjunto.size());

    conjunto.retainAll(nums);

    System.out.println(conjunto);
  }
}