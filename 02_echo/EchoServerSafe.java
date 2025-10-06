import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerSafe {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server in attesa di connessioni...");

            try (Socket clientSocket = serverSocket.accept()) {
                System.out.println("Client connesso: " + clientSocket.getInetAddress());

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String messaggio = in.readLine();
                System.out.println("Ricevuto: " + messaggio);

                out.println(messaggio);
                System.out.println("Risposto con: " + messaggio);
            }
        } catch (Exception e) {
            System.err.println("Errore nel server: " + e.getMessage());
        }

        System.out.println("Server terminato.");
    }
}
