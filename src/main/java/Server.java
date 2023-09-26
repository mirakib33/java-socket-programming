package src.main.java;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 12345;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server listening on port " + port);

        while (true) {
            Socket clientSocket = serverSocket.accept(); // Wait for a client to connect
            // Handle the client connection in a separate thread or process
            new ClientHandler(clientSocket).start();
        }
    }
}
