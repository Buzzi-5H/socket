import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server in attesa di connessioni...");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connesso: " + clientSocket.getInetAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String messaggioDalClient = in.readLine();
        System.out.println("Messaggio ricevuto: " + messaggioDalClient);

        clientSocket.close();
        serverSocket.close();

        System.out.println("Server terminato.");
    }
}
