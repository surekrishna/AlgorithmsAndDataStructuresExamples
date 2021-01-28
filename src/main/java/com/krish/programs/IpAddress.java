package com.vit.products.ctrlpay;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class IpAddress {

	public static void main(String[] args) throws Exception {
		System.out.println(getIpAddress());
	}
	
	public static String getIpAddress() throws Exception {
		try(final DatagramSocket socket = new DatagramSocket()){
			  socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
			  return socket.getLocalAddress().getHostAddress();
		}
	}
}
