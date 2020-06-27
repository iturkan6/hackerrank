public class MiniTest {
    public static void fizzBuzz(int n) {
        // Write your code here
        for (int i = 1; i < n; i++) {

            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FlizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Flizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }
    }
}
