import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

public class CountingValley {
    static int countingValleys(int n, String s) {
        int count = 0;
        List<Integer> list = s.chars().boxed().map(x -> x == 'U' ? 1 : -1).collect(Collectors.toList());
        int sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sum += list.get(i);
            if (sum == 0 && list.get(i) == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
        //Expected result is "2"
        System.out.println(countingValleys(5, "UUDD"));
        //Expected result is "0"
        System.out.println(countingValleys(2, "DU"));
        //Expected result is "1"
    }
}
