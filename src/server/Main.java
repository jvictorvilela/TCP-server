package server;

import java.net.SocketException;

/**
 *
 * @author victor
 */
public class Main {

    public static void main(String[] args) throws SocketException {
        int port = Integer.parseInt(args[0]);
        String fileDirectory = args[1];
        Server server = new Server(port, fileDirectory);
        
        // iniciando servidor
        server.startServer();
    }
    
}
