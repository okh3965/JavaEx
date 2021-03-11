package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		// server socket
		ServerSocket serverSocket = null;
		
		try {
			//	bind - ip connect
			serverSocket = new ServerSocket();
			InetSocketAddress ips = new InetSocketAddress("0.0.0.0", 10000);
			serverSocket.bind(ips);
			
			// start message
			System.out.println("<Server Start>");
			System.out.println("SERVER: [wait for connecting..]");
			
			// wait
			Socket socket = serverSocket.accept();
			// verify client information
			InetSocketAddress socketAddress =
					//verify remote socket address
					(InetSocketAddress)socket.getRemoteSocketAddress();	
			System.out.println("SERVER: [Client connected successfully]");
			System.out.println("	Client:" + socketAddress.getAddress() + 
								":" + socketAddress.getPort());
			
			// message receiving
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			// read a message
			String message;
			
			while(true) {
				message = br.readLine();
				
				if(message == null) {	//no more message
					System.out.println("SERVER: [Shut Down Connection]");
					break;
				}
				System.out.println("SERVER: [message] " + message);
			}
			
			
			// post-processing
			System.out.println("SERVER: [Server terminated]");
		} catch(Exception e ) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
