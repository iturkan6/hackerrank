import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */

public class Birthday {
    static int birthday(List<Integer> s, int d, int m) {
        if (s.get(0) == d && m == 1) return 1;
        int count = 0;
        int res = 0;
        for (int i = 0; i <= s.size() - m ; i++) {
            for (int j = i; j < m+i; j++) {
                count += s.get(j);
            }
            System.out.println(count);
            if (count == d) {
                count = 0;
                res++;
            } else count = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
    }
}
