public class NameLength {
  public static void main(String[] args) {
    String name = "Charlie";
    int length = name.length();
    char letter = name.charAt(1);
    System.out.println("Your name has " + length + " characters.");
    System.out.println("The character at index 1 is: " + letter);
//    substring(start, end)

    String partFrom1To4 = name.substring(1, 4);
    String partFrom4To5 = name.substring(4, 6);

    System.out.println("The full string is: " + name);
    System.out.println("The substring from index 1 to 4. 4 excluded: " + partFrom1To4);
    System.out.println("The substring from index 4 to 5. 5 excluded: " + partFrom4To5);
  }
}
