import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;

        for (int number : ar) {
            sum += number;
        }
        return sum;
    }

    public class sumArray {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            int howMuchNumbers = entrada.nextInt();

            List<Integer> ar = new ArrayList<>();
            for (int i = 0; i <= howMuchNumbers; i++) {
                int num = entrada.nextInt();
                ar.add(num);
            }

            int result = Result.simpleArraySum(ar);

            System.out.println(result);

            entrada.close();
        }
    }
}
