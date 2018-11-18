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
import java.net.ServerSocket;
import java.net.Socket;

public class server_socket {
    private static final long MEGABYTE = 1048576; //1024 x 1024 = 1048576

    public static long bytesToMegabytes(long memory) {
        return memory / MEGABYTE;
    }
    
    public static void main(String[] args) {
        
        try
        {
            ServerSocket ser = new ServerSocket(8080);
            Socket sock = ser.accept();
            
           BufferedReader ed = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String tmp = ed.readLine();
            System.out.print("I Received :"+tmp);
            
      
       
              Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
            PrintStream pr = new PrintStream(sock.getOutputStream());
            String str = "Memory Use:"+memory+" bytes";
            pr.println(str);
           
            
    
       
        }catch(IOException ex){}
}
}