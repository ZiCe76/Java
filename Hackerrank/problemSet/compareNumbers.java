import java.util.ArrayList;
import java.util.List;

public class compareNumbers {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(99);
        b.add(16);
        b.add(8);


    }

}

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int pointsA = 0;
        int pointsB = 0;
        for(int i = 0; i <= a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                pointsA++;
            } else if (a.get(i) < b.get(i) ) {
                pointsB++;
            }
            
        }
        List<Integer> result = new ArrayList<>();
        result.add(pointsA);
        result.add(pointsb);
        return result;
    }

}
