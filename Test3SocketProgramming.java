/*
 SITI NABILAH MOHAMMAD ZAIN
2017421006
NETWORK PROGRAMMING 
 */
package test.pkg3.socket.programming;

/**
 *
 * @author smohammadzai
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Test3SocketProgramming {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // client socket 
        
        try
        {
            Socket sock = new Socket("localhost",8080);
            
            PrintStream pr = new PrintStream(sock.getOutputStream());
            
            System.out.print("Hit ENTER the number to know RAM condition   : ");
            
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader ed = new BufferedReader(rd);
            
            String temp = ed.readLine();
            
            pr.println(temp);
            
            BufferedReader gt = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            
            String tm = gt.readLine();
            System.out.print(tm);
            
        }catch(IOException ex)
        {
        
        }
    }
    
}
