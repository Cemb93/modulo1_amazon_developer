package Metodos_String;

public class metodos_string {
  public static void main(String args[]) {
    String text = "Adventure";
    // TODO: Check the length using length() and print the length
    int length = text.length();
    // TODO: Get the character at position 3 and print the character
    char letter = text.charAt(1);
    // TODO: Get a part of the String from position 1 to 4 and print the string
    String partFrom1To4 = text.substring(1, 4);
    String partFrom4To5 = text.substring(4, 6);

    System.out.println("Texto: " + text +
            " | Longitud: " + length +
            " | Char(1): " + letter +
            " | Sub(1,4): " + partFrom1To4 +
            " | Sub(4,6): " + partFrom4To5
    );

    String anotherText= "Adventure";
    // TODO: Compare text with anotherText using equals() and print the output
    boolean result1 = text.equals(anotherText);
    // TODO: Change to uppercase using toUpperCase() and print the converted string
    String fruitInUpperCase = anotherText.toUpperCase();
    // TODO: Change to lowercase using toLowerCase() and print the converted string
    String fruitInLowerCase = anotherText.toLowerCase();
    // TODO: Check if it contains "vent" using contains() and print the output
    boolean hasTure = anotherText.contains("ture");
    boolean hasBrooks = anotherText.contains("brooks");
    // TODO: Replace 'e' with 'a' and print the output
    String replaceLetters = anotherText.replace('e','a');

    System.out.println("Iguales: " + result1 +
            " | Upper: " + fruitInUpperCase +
            " | Lower: " + fruitInLowerCase +
            " | Contiene 'ture': " + hasTure +
            " | Contiene 'brooks': " + hasBrooks +
            " | Replace e→a: " + replaceLetters
    );
  }
}
