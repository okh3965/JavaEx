package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		printLocalIp();
		// verify the address of the server
		printServerIp("www.naver.com");
		printServerIp("www.google.com");
	}

	private static void printServerIp(String hostname) {
		try {
			InetAddress[] adrs = InetAddress.getAllByName(hostname);
			for (InetAddress remote: adrs) {
				System.out.println(hostname + ": IP" + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	// 내 컴퓨터가 할당 받은 ip 확인(localhost)
	private static void printLocalIp() {
		try {
			// check my ip address
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local IP:" + local.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	
}
