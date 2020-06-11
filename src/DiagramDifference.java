public class DiagramDifference {

    public static int calculate(int[][] b) {
        int sum_left = 0;
        int sum_right = 0;
        for (int i = 0; i < b.length; i++) {
            sum_left += b[i][i];
        }
        for (int i = b.length - 1; i >= 0; i--) {
            sum_right += b[i][i];
        }
        return Math.abs(sum_left - sum_right);
    }

    public static void main(String[] args) {
        int[][] a =
                {
                        {1, 2, 3, 4,},
                        {5, 6, 7, 8,},
                        {9, 10, 11, 12,},
                        {13, 14, 15, 16,},

                };
        System.out.println(calculate(a));
    }
}
