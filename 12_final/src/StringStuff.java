public class StringStuff {
    public static void main(String[] args) {
        String str = "This is my first text variable";

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        System.out.println("First letter: " + first);
        System.out.println("Last letter: " + last);

        String strWithSpaces = "             asdf     ";
        System.out.println(strWithSpaces);
        System.out.println(strWithSpaces.trim());

        String names = "Hugo,Berta,Felix,Gernot,Beate";
        String[] namesArr = names.split(",");
        System.out.println("Last name: " + namesArr[namesArr.length - 1]);

        String[] streetNames = {"Sonnenstrasse", "Waldweg", "Asphaltplatz"};
        String joinedStreetNames = String.join(";", streetNames);
        System.out.println(joinedStreetNames);

        /*
            toUpperCase / toLowerCase - wandelt alles in Gross / Kleinschreibung um
            substring() - einen Teil von einem String extrahieren
         */

        String file1 = "myFile.txt";
        String file2 = "C:\\Users\\Testuser";

        String txtFilePattern = ".+\\.txt";

        System.out.println("File 1 is a txt file: " + file1.matches(txtFilePattern));
        System.out.println("File 2 is a txt file: " + file2.matches(txtFilePattern));
    }
}
