import java.io.*;
import java.net.*;

public class DataReceiver {
    public static void main(String[] args) {
        
        // Ensure the user provided a port number argument
        if (args.length < 1) {
            System.out.println("Usage: java connectionServerObject <port>");
            return;
        }

        try {
            // Parse the port number from the command line argument
            int port = Integer.parseInt(args[0]);
            
            // Create a server socket bound to the specified port
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started on port " + port + ". Waiting for connection...");
            
            // The accept() method blocks (waits) until a client connects
            Socket socket = serverSocket.accept();

            // Create an input stream to read the serialized object from the socket
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            // Read the object from the stream and cast it to the Employee class
            StuffData  employee = (StuffData) ois.readObject();

            // Display the received employee details
            System.out.println("Employee id : " + employee.id);
            System.out.println("Employee name : " + employee.name);
            System.out.println("Employee salary : " + employee.salary);

            // Close streams and sockets to release resources
            ois.close();
            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}