import java.util.Locale;

public class StringOperations {
    static int countCharacterInString(String str, char ch) {
        int counter = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                counter++;
            }
        }

        return counter;
    }

    static String caesarEncrypt(String input, int offset) {
        String encryptedOutput = "";

        for(int i = 0; i < input.length(); i++) {
            char newChar = (char) (input.charAt(i) + offset);
            encryptedOutput = encryptedOutput + newChar;
        }

        return encryptedOutput;
    }

    static String removeTrailingAndLeadingWhitespace(String input) {
        String trimmed = input.trim();
        System.out.println("The following number of whitespace characters has been removed: " + (input.length() - trimmed.length()));
        return trimmed;
    }

    static String getFirstNCharacters(String input, int numOfCharacters) {
        return  input.substring(0, numOfCharacters);
    }

    static boolean areStringsEqual(String str1, String str2) {
        String lowercaseStr1 = str1.toLowerCase();
        String lowercaseStr2 = str2.toLowerCase();

        // no '==' because that would compare the addresses and not the values
        return lowercaseStr1.equals(lowercaseStr2);
    }

    static boolean validateEmail(String email) {
        boolean isValid = true;

        int indexOfAt = email.indexOf('@');
        if(indexOfAt == 0 || indexOfAt == email.length()-1 || indexOfAt == -1) {
            System.out.println("The character '@' has not been found on a suitable position");
            isValid = false;
        }

        return isValid;
    }

    public static void main(String[] args) {
        String ourSentence = "hello world";

        System.out.println("First character: " + ourSentence.charAt(0));
        System.out.println("Last character: " + ourSentence.charAt(ourSentence.length()-1));

        // count characters
        int occurenceOfL = countCharacterInString(ourSentence, 'l');
        System.out.println("The character appears " + occurenceOfL + " times in the string.");

        // encrypt with caesar cipher
        String encryptedSentence = caesarEncrypt(ourSentence, 3);
        System.out.println("Encrypted sentence: " + encryptedSentence);

        // trim - removes leading and trailing whitespace
        String ugly = "   our data here     ";
        String beautiful = removeTrailingAndLeadingWhitespace(ugly);

        // substring - returns a portion of the string;
        String testStr = "1234abcd";
        String numbersOnly = testStr.substring(0, 4);
        System.out.println("Extracted substring: " + numbersOnly);

        String lettersOnly = testStr.substring(4);
        System.out.println("Extracted letters: " + lettersOnly);

        // substring with custom method
        System.out.println("Extracted substring by method: " + getFirstNCharacters(testStr, 4));

        // convert to upper- or lowercase
        String regularSentence = "Hello, how are you doing Hugo?";
        String uppercaseSentence = regularSentence.toUpperCase();
        String lowercaseSentence = regularSentence.toLowerCase();

        System.out.println("Regular: " + regularSentence);
        System.out.println("Uppercase: " + uppercaseSentence);
        System.out.println("Lowercase: " + lowercaseSentence);

        String word1 = "Hugo";
        String word2 = "hugo";

        // split - splits a string apart based on a regex / character
        String sentence = "Today is a wonderful day";
        String[] words = sentence.split(" ");
        System.out.println("Words in this sentence: " + words.length);

        String distortedSentence = "TodayLEERisLEERaLEERwonderfulLEERday";
        String[] reformattedSentence = distortedSentence.split("LEER");

        // join - takes a string array and concatenates each element using the given String
        String rejoinedSentence = String.join(",", reformattedSentence);
        System.out.println(rejoinedSentence);

        // indexOf - gives us the index of a specified character in a string
        String email = "john.doe@aau.at";
        System.out.println("Position of '@': " + email.indexOf('@'));

        boolean email1Valid = validateEmail("@bla.at");
        boolean email2Valid = validateEmail("bla.at");
        boolean email3Valid = validateEmail("bla.at@");
        boolean email4Valid = validateEmail(email);

        System.out.println("--- END ---");
    }
}
