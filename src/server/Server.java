package server;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author victor
 */
public class Server {
    private int port;
    private String fileDirectory;
    private DatagramSocket serverSocket;
    
    public Server(int port, String fileDirectory) {
        this.port = port;
        this.fileDirectory = fileDirectory;
        
    }
    
    // inicia o servidor na porta determinada
    public void startServer() throws SocketException {
        
        // instanciando socket do servidor
        serverSocket = new DatagramSocket(port);
        
        System.out.println("Iniciando o servidor na porta: "+port);
        
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
        
        // cria thread para aguardar comandos
        listenCommands();
        
        //
        while (true) {
            //...
        }

    }
    
    public void stopServer() {
        serverSocket.close();
    }
    
    private void listenCommands() {
        ListenCommandsThread lct = new ListenCommandsThread(this);
        new Thread(lct).start();
    }
    
    
}
