import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = {
                { 72, 74, 78, 76 },
                { 65, 64, 61, 67 },
                { 95, 98, 99, 100 }
        };

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println(grades[i][j]);
            }
        }

    }
}