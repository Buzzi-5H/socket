// Aggiungi gli import necessari

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientSleep {
  public static void main(String[] args) {
      try (Socket socket = new Socket("localhost", 12345)){
          System.out.println("Connesso al server.");

          PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

          for (int i = 1; i <= 10; i++) {
              String messaggio = "Messaggio " + i;
              out.println(messaggio);
              System.out.println("Messaggio inviato: " + messaggio);
              in.readLine();
              System.out.println("Risposto con: " + messaggio);
              Thread.sleep(1000);
          }
      } catch (Exception e) {
          System.err.println("Errore nel client: " + e.getMessage());
      }
  }
}