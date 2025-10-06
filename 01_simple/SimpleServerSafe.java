import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServerSafe {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server in attesa di connessioni...");

            try (Socket clientSocket = serverSocket.accept()) {
                System.out.println("Client connesso: " + clientSocket.getInetAddress());

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String messaggioDalClient = in.readLine();
                System.out.println("Messaggio ricevuto: " + messaggioDalClient);
            }
        } catch (Exception e) {
            System.err.println("Errore nel server: " + e.getMessage());
        }

        System.out.println("Server terminato.");
    }
}
