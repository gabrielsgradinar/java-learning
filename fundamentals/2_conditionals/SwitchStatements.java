public class SwitchStatements {
    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("You can wear a shirt");
                break;
            case "cloudy":
                System.out.println("You should waer a sweater");
                break;
            case "rainy":
                System.out.println("You should wear a raincoat");
                break;
            case "snowy":
                System.out.println("You should wear a jacket");
                break;
            default:
                System.out.println("You can wear whatever you want");
                break;
        }

    }
}
