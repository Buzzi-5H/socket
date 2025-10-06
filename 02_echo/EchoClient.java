import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String messaggio = "Ciao, mondo echo!";
        System.out.println("Invio: " + messaggio);
        out.println(messaggio);

        String risposta = in.readLine();
        System.out.println("Risposta del server: " + risposta);

        socket.close();
        System.out.println("Client terminato.");
    }
}
