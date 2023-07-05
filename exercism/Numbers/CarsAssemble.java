public class CarsAssemble {
    public static void main(String[] args) {
        System.out.println(workingItemsPerMinute(6));
    }

    public double productionRatePerHour(int speed) {
        int baseCalc = speed * 221;
        if (speed >= 1 && speed <= 4) {
            return baseCalc;
        } else if (speed >= 5 && speed <= 8) {
            return baseCalc * 0.9;
        } else if (speed == 9) {
            return baseCalc * 0.8;
        } else {
            return baseCalc * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {

        return (int) productionRatePerHour(speed) / 60;
    }
}
