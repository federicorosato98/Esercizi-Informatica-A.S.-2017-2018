/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mioclient;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author FEDERICO
 */
public class MioClient {

    private Socket socket;
    private Scanner scanner;
    
    private MioClient(InetAddress serverAddress, int serverPort) throws Exception {
        this.socket = new Socket(serverAddress, serverPort);
        this.scanner = new Scanner(System.in);
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Inserisci IP server: ");
        InetAddress serverIP = InetAddress.getByName("127.0.0.1");
        MioClient client = new MioClient(serverIP, 58898);
        
        System.out.println("\r\nConnected to: " + client.socket.getInetAddress());
        client.start();             
    }
    
    private void start() throws IOException {
        String input;
        while (true) {
            input = scanner.nextLine();
            PrintWriter out = new PrintWriter(this.socket.getOutputStream(), true);
            out.println(input);
            out.flush();
        }
    }   
    
}
