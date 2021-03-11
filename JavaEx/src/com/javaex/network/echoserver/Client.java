package com.javaex.network.echoserver;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			//create socket object
			socket = new Socket();
			
			// start message
			System.out.println("<Client Start>");
			System.out.println("CLIENT: [connection request]");
			
			// attempt to connect
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			socket.connect(remote);
			
			// connect success
			System.out.println("CLIENT: [connect the server successfully]");
			
			// post-processing
			System.out.println("<Client terminate>");
			
		} catch(ConnectException e) {
			System.err.println("[Connection denied.]");
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		
		}
	}
}
