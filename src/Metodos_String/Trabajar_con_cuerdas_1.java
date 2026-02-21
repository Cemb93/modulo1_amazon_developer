package Metodos_String;

public class Trabajar_con_cuerdas_1 {
  public static void main(String[] args) {
    String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
    int titleLength = bookTitle.length();
    //TODO: Complete the code statement to find out the length of bookTitle
    System.out.println("Length of the book title: " + titleLength);

    int maxLength = 20;
    String shortBookTitle = bookTitle.substring(0, maxLength);
    // TODO: Write the code to shorten the bookTitle to 20 characters
    System.out.println("Original title: " + bookTitle);
    System.out.println("Shortened title: " + shortBookTitle);

    String searchWord = "Captain";
    boolean containsWord = bookTitle.contains(searchWord);
    //TODO: Write the code snippet to check if searchWord is present in bookTitle.
    System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);

    final String originalPhrase = "Java programming is fun and educational";

    // 1️⃣ Comprobar si contiene la palabra "fun"
    boolean containsFun = originalPhrase.contains("fun");

    // 2️⃣ Sustituir "educational" por "amazing"
    String replacedPhrase = originalPhrase.replace("educational", "amazing");

    // 3️⃣ Calcular la longitud
    int originalLength = originalPhrase.length();

    // 4️⃣ Acortar a 17 caracteres (validando longitud)
    String shortenedPhrase = originalPhrase.length() > 17
            ? originalPhrase.substring(0, 17)
            : originalPhrase;

    // Mostrar resultados (forma moderna)
    System.out.println("""
        Frase original: %s
        Contiene 'fun': %b
        Frase reemplazada: %s
        Longitud original: %d
        Frase acortada (17 caracteres): %s
        """.formatted(
            originalPhrase,
            containsFun,
            replacedPhrase,
            originalLength,
            shortenedPhrase
    ));
  }
}
