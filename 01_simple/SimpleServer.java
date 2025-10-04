import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
  public static void main(String[] args) {
    try {
      // Crea la ServerSocket

      // Aspetta e accetta la connessione del client

      // Ottieni l'oggetto per leggere i messaggi del client dalla socket

      // Leggi il messaggio

    } catch (Exception e) {
      System.err.println("Errore nel server: " + e.getMessage());
    } finally {
      // Rilascia le risorse
    }

    System.out.println("Server terminato.");
  }
}
