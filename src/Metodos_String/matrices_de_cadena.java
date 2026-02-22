package Metodos_String;

public class matrices_de_cadena {
  public static void main(String[] args) {
    String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
    int[] introductionYears = {1939, 1938, 1941, 1962, 1963};
    // 3a: imprimir el nombre original del tercer superhéroe
    System.out.println(
            "Nombre original: " + superheroes[2] +
            " Año de introducción: " + introductionYears[2]
    );

    // 3b: modificar el nombre del tercer superhéroe
    superheroes[2] = "Thor";
    introductionYears[2] = 2011;

    for (int i = 0; i < superheroes.length; i++) {
      System.out.printf("Superhéroe: %-12s | Año de introducción: %d%n",
              superheroes[i],
              introductionYears[i]
      );
    }

    // 3c: imprimir el nombre modificado
    System.out.println(
            "Nombre modificado: " + superheroes[2] +
            " Año modificado: " + introductionYears[2]
    );

    // 5a: imprimir la longitud del arreglo de nombres
    System.out.println("Cantidad de superhéroes: " + superheroes.length);

    // 5b: imprimir la longitud del arreglo de años
    System.out.println("Cantidad de años registrados: " + introductionYears.length);
  }
}
