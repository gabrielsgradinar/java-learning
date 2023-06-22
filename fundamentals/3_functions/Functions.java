public class Functions {
    public static void main(String[] args) {
        double calculatedArea = calculateArea(5.5, 7);

        System.out.println(calculatedArea);

    }

    public static double calculateArea(double lenght, double width) {
        double area = lenght * width;

        return area;
    }
}
