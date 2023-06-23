public class WhileLoop {

    public static void main(String[] args) {
        int diceRoll = -1;
        while (diceRoll != 6) {
            diceRoll = rollDice();
            System.out.println(diceRoll);
        }
    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

}
