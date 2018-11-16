package server;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class ListenCommandsThread implements Runnable {
    private Server server;
    private Scanner input;
    
    public ListenCommandsThread(Server server) {
        this.server = server;
        input = new Scanner(System.in);
    }

    @Override
    public void run() {
        while (true) {
            // falta terminar
            if (input.nextLine().equals("exit")) {
                System.out.println("Finalizando servidor...");
                server.stopServer();
                System.exit(0);
            }
        }
    }
    
}
