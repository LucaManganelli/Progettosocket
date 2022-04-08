
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucamanganelli
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int port=2000;
        
        int time=5000;
        
        ServerSocket sSocket = null;
        
        Socket connection = null;
        
        try {
            
            sSocket = new ServerSocket(port);
            System.out.println   (" In attesa di connessioni con il client ");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(true){
            try{
                
                if (sSocket!=null)()
                        
            }
        }            
        
        
        
        
    }
    
}
