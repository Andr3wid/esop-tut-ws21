package tut.esop.aau;

public class StringFunctions {
    // replace("I am a word", "word", "sentence")
    static String replace(String input, String toReplace, String newValue) {
        String[] splits = input.split(toReplace);

        if(splits.length != 1) {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < splits.length-1; i++) {
                sb.append(splits[i]);
                sb.append(newValue);
            }

            return sb.toString();

        } else {
            return input;
        }
    }

    public static void main(String[] args) {
        /*
        // basic StringBuilder example
        StringBuilder sb = new StringBuilder();

        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        System.out.println(sb.toString());
         */

        String replacedSentence = replace("Today is a rainy day.", "rainy", "sunny");
        System.out.println(replacedSentence);

    }
}
