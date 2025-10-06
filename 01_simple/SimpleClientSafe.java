import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClientSafe {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)){
            System.out.println("Connesso al server.");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String messaggio = "Hello World dal client!";
            out.println(messaggio);
            System.out.println("Messaggio inviato: " + messaggio);
        } catch (Exception e) {
            System.err.println("Errore nel client: " + e.getMessage());
        }

        System.out.println("Client terminato.");
    }
}
