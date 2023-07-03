import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Tommy", "Joel", "Ellie" };
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Abby";


        // String[] staffThisYear = staffLastYear;
        // staffThisYear[1] = "Abby"; // modify the same reference

        System.out.println(Arrays.toString(staffLastYear));        
        System.out.println(Arrays.toString(staffThisYear));

    }
}
