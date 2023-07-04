public class Blackjack {

    public static void main(String[] args) {
        System.out.println(firstTurn("ace", "ace", "ace"));

    }

    public static int parseCard(String card) {

        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;

            default:
                return 0;
        }
    }

    public static boolean isBlackjack(String card1, String card2) {
        int sum = parseCard(card1) + parseCard(card2);

        return sum == 21;
    }

    public static String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            if (dealerScore < 10) {
                return "W";
            } else {
                return "S";
            }
        } else {
            return "P";
        }

    }

    public static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else if (dealerScore >= 7) {
            return "H";
        }

        return "S";

    }

    public static String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}