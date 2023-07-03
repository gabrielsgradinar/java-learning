public class LogLevels {

    public static String message(String logLine) {
        String logMessage = logLine.split(": ")[1];
        return logMessage.trim();
    }

    public static String logLevel(String logLine) {
        String level = logLine.split(": ")[0].replace("[", "").replace("]", "");
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = logLine.split(": ")[1].trim();
        String level = logLine.split(": ")[0];

        level = level.replace("[", "(").replace("]", ")").toLowerCase();

        return message + " " + level;

    }
}
