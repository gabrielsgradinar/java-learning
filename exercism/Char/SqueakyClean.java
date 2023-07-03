class SqueakyClean {

    public static void main(String[] args) {
        System.out.println(clean("MyΟβιεγτFinder"));
    }

    static String clean(String identifier) {
        char[] charArray = identifier.toCharArray();

        StringBuilder output = new StringBuilder();
        boolean prevHyphen = false;

        for (char c : charArray) {
            if (c == ' ') {
                output.append('_');
            }

            if (Character.isISOControl(c)) {
                output.append("CTRL");
            }

            if (Character.isLetter(c) && !(c >= 'α' && c <= 'ω')) {
                output.append(!prevHyphen ? c : Character.toUpperCase(c));
            }

            prevHyphen = c == '-';

        }

        return output.toString();
    }
}