
import java.util.*;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/encryption/problem
 */

public class Encryption {

    static String encryption(String s) {
        List<Character> letters = new ArrayList<>();
        IntStream.range(0, s.length()).forEach(i -> {
            char letter = s.charAt(i);
            letters.add(letter);
        });
        int length = (int) Math.sqrt(letters.size());
        char[][] matrix = new char[length + 1][length];
        int n = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length + 1; j++) {
                if (n < letters.size()) {
                    matrix[j][i] = letters.get(n);
                    n++;
                } else break;
            }
        }
        for (int i = 0; i < length + 1; i++) {
            for (int j = 0; j < length; j++) {
                sb.append(matrix[i][j]);
            }
            sb.append(" ");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(encryption("helloworld"));

    }
}
