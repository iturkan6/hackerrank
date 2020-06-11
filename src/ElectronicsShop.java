
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int min = Integer.MIN_VALUE;
        return IntStream.range(0, keyboards.length).boxed().flatMapToInt(x -> IntStream.range(0, drives.length).boxed().
                flatMapToInt(y -> IntStream.of(x +y  < b ? Math.max(x + y, min) : -1))).sorted().findFirst().orElseThrow(RuntimeException::new);
//        Arrays.stream(keyboards).flatMap(x -> Arrays.stream(drives)).flatMap(y -> {
//            int sum = x + y;
//            int max = Math.max(sum, min);
//        })
    }
}
