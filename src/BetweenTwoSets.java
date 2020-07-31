import java.util.*;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();
        Integer min = Collections.min(b);
        while (min > 0) {
            boolean mark = true;
            for (Integer el1 : b) {
                if (el1 % min != 0) {
                    mark = false;
                    break;
                }
            }
            if (mark && !list.contains(min)) list.add(min);
            min--;
        }
        new ArrayList<>(list).forEach(nums -> a.stream().filter(el2 -> nums % el2 != 0).map(el2 -> nums)
                .forEach(list::remove));
        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(getTotalX(Collections.singletonList(2), Arrays.asList(20, 30, 12)));
    }
}
