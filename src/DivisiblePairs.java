
/**
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */


public class DivisiblePairs {
//    static class Pair<A, B> {
//        final A a;
//        final B b;
//
//        Pair(A a, B b) {
//            this.a = a;
//            this.b = b;
//        }
//
//    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
//        return Arrays.stream(ar).map(n1 -> (int) Arrays.stream(ar).filter(n2 -> (n1 + n2) % k == 0).count());
        //       return (int) Arrays.stream(ar).flatMap(n1 -> Arrays.stream(ar).filter(n2 -> (n1 + n2) % k == 0)).count();
        int res = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int i1 = 0; i1 < ar.length; i1++) {
                if ((ar[i] + ar[i1]) % k == 0 && i != i1) {
                    System.out.print(ar[i]);
                    System.out.println(ar[i1]);
                    res++;
                }
            }
        }
        return res/2;

    }

    public static void main(String[] args) {

        System.out.println(divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));
    }
}
