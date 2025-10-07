/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
import java.net.*;
import java.io.*;
import java.util.*;
public class SocketServer {
    
   public static void main(String[]args) throws Exception{
       
        ServerSocket servSocket=new ServerSocket(4000);
        System.out.println("***Server Side***");
        System.out.println("Server ready for connection");
        Socket connSock=servSocket.accept();
        System.out.println("Connection is successful and ready for file transfer ");
        InputStream istream= connSock.getInputStream();
        BufferedReader fileRead=new BufferedReader(new InputStreamReader(istream));
        String fname= fileRead.readLine();
        File fileName= new File(fname);
        OutputStream ostream=connSock.getOutputStream();
        PrintWriter pwrite= new PrintWriter(ostream,true);
        if(fileName.exists()){
            BufferedReader contentRead=new BufferedReader(new FileReader(fname));
            System.out.println("Writing file contents to the socket");
            String str;
            while((str=contentRead.readLine())!=null){
            
                pwrite.close();
            }
        contentRead.close();
        }
        else{
            System.out.println("requested file doesnot exist");
            String msg="requested file doesnot exist at server side";
            pwrite.println(msg);
        }
        connSock.close();
        servSocket.close();
        fileRead.close();
        pwrite.close();
   }
}
