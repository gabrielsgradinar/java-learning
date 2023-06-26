public class BreakAndContinue {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\nNumbers");
        for (int i = 1; i < 11; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\nDivisible by 3");
        for (int i = 21; i < 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                break;
            }
        }

        System.out.println("\nEven numbers");
        for (int i = 1; i < 21; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
