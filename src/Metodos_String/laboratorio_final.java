package Metodos_String;

public class laboratorio_final {
  public static void main(String[] args) {
    String firstName = "Sandy";
    String lastName = "Jones";
    String movieTitle = "The Source Code";
    int numberOfTickets = 8;
    double pricePerTicket = 10.57;

    System.out.println("""
        Nombre: %s
        Apellido: %s
        Película: %s
        Número de entradas: %d
        Precio por entrada: $%.2f
        """.formatted(
            firstName,
            lastName,
            movieTitle,
            numberOfTickets,
            pricePerTicket
    ));

    // Calcular el precio total
    double totalPrice = numberOfTickets * pricePerTicket;

    // Imprimir resultado
    System.out.printf("Total Price of %d tickets: $%.2f%n",
            numberOfTickets,
            totalPrice
    );

    // Generar nombre de usuario
    String username = (firstName + lastName).toLowerCase();

    // Imprimir resultado
    System.out.println("Nombre de usuario generado: " + username);

    String movieUpdate = movieTitle.toUpperCase();
    System.out.println("Updated movie name: " + movieUpdate);

    System.out.println("Thank you for choosing us for booking your movie tickets\n");

    System.out.printf("""
        --- DETALLES DE LA RESERVA ---
        Username: %s
        Movie: %s
        Number of Tickets: %d
        Price per ticket: $%.2f
        Total price: $%.2f
        """,
            username,
            movieUpdate,
            numberOfTickets,
            pricePerTicket,
            totalPrice
    );

    System.out.println("Thank you for choosing us for booking your movie tickets");
    System.out.println("\nEnjoy your movie!!!");
  }
}
