import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientSafe {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)){
            System.out.println("Connesso al server.");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String messaggio = "Ciao, mondo echo!";
            System.out.println("Invio: " + messaggio);
            out.println(messaggio);

            String risposta = in.readLine();
            System.out.println("Risposta del server: " + risposta);
        } catch (Exception e) {
            System.err.println("Errore nel client: " + e.getMessage());
        }

        System.out.println("Client terminato.");
    }
}
