package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
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
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);	//address, iter
			socket.connect(remote);
			
			// connect success
			System.out.println("CLIENT: [connect the server successfully]");
			
			// message sending
			OutputStream os = socket.getOutputStream();	// 소켓에서 출력 스트림 획득
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			// Receive a Echo back message
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			// message sending
			String message = "test message";
			bw.write(message);
			bw.newLine();
			bw.flush();
			System.out.println("CLIENT:[message]: " + message);
			
			// message receiving
			String rcvMsg = br.readLine();
			System.out.println("CLIENT:[received message]:" + rcvMsg);
			
			br.close();
			bw.close();
			
	
			// post-processing
			System.out.println("<Client terminated>");
			
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
