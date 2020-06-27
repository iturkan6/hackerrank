import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem?h_r=internal-search
 */

public class MigratoryBirds {
    static class Pair<A, B> {
        final A a;
        final B b;

        Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }
    static int migratoryBirds(List<Integer> arr) {
        List<Pair<Integer, Long>> collect = arr.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().map(n -> new Pair<>(n.getKey(), n.getValue()))
                .sorted(((t1, t2) -> t2.b.compareTo(t1.b))).collect(Collectors.toList());
        return collect.get(0).b > collect.get(1).b ? collect.get(0).a : collect.get(0).a < collect.get(1).a ? collect.get(0).a : collect.get(1).a;
    }
}
