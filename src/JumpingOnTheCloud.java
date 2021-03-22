import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnTheCloud {
    static int jumpingOnClouds(int[] c) {
        int jump = 0;
        for (int i = 0; i < c.length; i++) {
            jump++;
            if (c[i + 2] == 0) {
                i++;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
        //Expected output is "4"
    }
}
