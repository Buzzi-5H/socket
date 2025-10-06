import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Echo Server in attesa di connessioni...");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connesso: " + clientSocket.getInetAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String messaggio = in.readLine();
        System.out.println("Ricevuto: " + messaggio);

        out.println(messaggio);
        System.out.println("Risposto con: " + messaggio);

        clientSocket.close();
        serverSocket.close();

        System.out.println("Server terminato.");
    }
}
