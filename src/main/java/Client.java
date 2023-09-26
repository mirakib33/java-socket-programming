package src.main.java;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverAddress = "localhost"; // Server's IP address or hostname
        int serverPort = 12345;

        try (Socket socket = new Socket(serverAddress, serverPort);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            // Send data to the server
            out.println("Hello, Server!");

            // Receive data from the server
            String response = in.readLine();
            System.out.println("Server response: " + response);
        }
    }
}
