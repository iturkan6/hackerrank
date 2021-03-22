import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class RepeatedString {
    static long repeatedString(String s, long n) {
        long count = 0;
        int i = 0;
        ArrayList<Character> list = new ArrayList<>();
        while (list.size() < n)
            for (int j = 0; j < s.length(); j++) {
                if (list.size() > n) break;
                list.add(s.charAt(j));
            }
        return list.stream().filter(x -> x.equals('a')).count();
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
        //Expected output is "7"
    }
}
