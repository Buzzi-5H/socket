import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultipleEchoClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboardIn = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Inserisci il messaggio da inviare al server (o exit per uscire)");
            String messaggio = keyboardIn.readLine();

            if (messaggio.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Invio: " + messaggio);
            out.println(messaggio);

            String risposta = in.readLine();
            if (risposta == null) {
                break;
            }
            System.out.println("Risposta del server: " + risposta);
        }

        socket.close();
        System.out.println("Client terminato.");
    }
}
