import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PowerCompany {
    static class Pair<A, B> {
        final A a;
        final B b;

        Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }


    public static int reduceCapacity(List<Integer> model) {
        int count = 1;
        int gen = (model.size() / 2) + 1;
        List<Pair<Integer, Long>> collect = model.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet()
                .stream()
                .map(a -> new Pair<>(a.getKey(), a.getValue()))
                .sorted(Comparator.comparing(x -> x.b))
                .collect(Collectors.toList());

        for (int i = collect.size() - 1; i > 0; i--) {
            if (collect.get(i).b + collect.get(i - 1).b >= gen) {
                return count;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(reduceCapacity(Arrays.asList(7, 10, 1, 2, 7, 7, 1)));
    }
}
