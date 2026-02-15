import java.io.*;
import java.net.*;
import java.util.Scanner;

public class DataSender {
    public static void main(String[] args) {
        
        // Ensure the user provided both hostname and port arguments
        if (args.length < 2) {
            System.out.println("Usage: java connectionClientObject <host> <port>");
            return;
        }

        try {
            String hostname = args[0];
            int port = Integer.parseInt(args[1]);
            
            // Establish a TCP connection to the server
            Socket socket = new Socket(hostname, port);
            
            // Use Scanner to get input from the user
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter employee id: ");
            int id = scanner.nextInt();
            // Consume the newline character left after nextInt()
            scanner.nextLine(); 
            
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();

            // Create the Employee object with the user's data
            StuffData employee = new StuffData(id, name, salary);

            // Create an output stream to send the object
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            
            // Serialize and write the object to the socket's output stream
            oos.writeObject(employee);
            
            // Clean up resources
            oos.close();
            socket.close();
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}