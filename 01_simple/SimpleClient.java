import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {
  public static void main(String[] args) {
    try {
      // Crea la socket per connettersi al server

      // Ottieni l'oggetto per inviare i messaggi al server

      // Invia il messaggio

    } catch (Exception e) {
      System.err.println("Errore nel client: " + e.getMessage());
    } finally {
      // Rilascia le risorse
    }

    System.out.println("Client terminato.");
  }
}
