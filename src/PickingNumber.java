import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 */

public class PickingNumber {
    static class Pair<A, B> {
        final A a;
        final B b;

        Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }

    public static int pickingNumbers(List<Integer> a) {
        List<Pair<Integer, Long>> pairs = a.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().map(n -> new Pair<>(n.getKey(), n.getValue())).collect(Collectors.toList());
        long res = pairs.stream().map(p -> p.b).max((x, y) -> (int) (x - y)).orElse(0L);
        if (pairs.size() == 1) return Math.toIntExact(pairs.get(0).b);
        for (int i = 0; i < pairs.size() - 1; i++) {
            if (Math.abs(pairs.get(i).a - pairs.get(i + 1).a) <= 1) {
                res = Math.max(res, pairs.get(i).b + pairs.get(i + 1).b);
            }
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
        //Expected result "5"
        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
        //Expected result "3"
    }
}
