public class Functions {
    public static void main(String[] args) {
        double calculatedArea = calculateArea(5.5, 7);

        System.out.println(calculatedArea);

        String explanation = explainArea("French");
        System.out.println(explanation);

    }

    public static double calculateArea(double lenght, double width) {
        if (lenght < 0 || width < 0) {
            System.out.println("Invalid Dimensions");
            System.exit(0);
        }
        return lenght * width;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default:
                return "Language not available";
        }
    }
}

// Spanish "area es igual a largo * ancho"
