import java.io.PrintWriter;
import java.net.Socket;
import java.io.IOException;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connesso al server.");

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String messaggio = "Ciao dal client!";
        out.println(messaggio);
        System.out.println("Messaggio inviato: " + messaggio);

        socket.close();
        System.out.println("Client terminato.");
    }
}
