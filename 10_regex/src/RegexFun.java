public class RegexFun {
    public static void main(String[] args) {
        String word = "hellohellohellohello";
        String word2 = "hello world";
        String word3 = "hellohellohellohellohellohellohellohellohellohello";
        String word4 = "I am feeling very good";
        String pattern = "I am .* good";

        String txtPattern = ".+\\.txt";
        String filename1 = "hello.txt";
        String filename2 = "bla.py";
        String filename3 = ".txt";
        String filename4 = "servus!txt";

        // NUMMER-logANYTHING.log
        String logFilePattern = "(1|2|3|4|5|6|7|8|9|0)+-log.*\\.log";
        String logFilePatternSet = "[0123456789]+-log.*\\.log";
        String logFilePatternAbbrev = "[0-9]+-log.*\\.log";
        String log1 = "1-logSensor.log";
        String log2 = "225-logHeater.log";
        String log3 = "logHeater.log";

        String wordPattern = "[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]+";
        String wordPatternImproved = "[a-zA-Z]+"; // (a-z|A-Z)+
        String testWord1 = "worlD";
        String testWord2 = "Hello";
        String testWord3 = "hello01";

        System.out.println("Matches: "+ testWord3.matches(wordPattern));
    }
}
