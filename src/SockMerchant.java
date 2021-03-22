import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

public class SockMerchant {
    static class Pair<A, B> {
        final A a;
        final B b;

        Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }

    static int sockMerchant(int n, int[] ar) {
        return Arrays.stream(ar).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .values().stream().map(x -> x % 2 == 0 ? x : x - 1).mapToInt(Long::intValue).sum() / 2;
    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}
