package Scoket.Learning;

import java.io.IOException;
import java.net.*;

public class datagramserver {
	
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramscoket=new DatagramSocket(0);
		String msg="hi client!";
		InetAddress ip=InetAddress.getByName("localhost");
		
		DatagramPacket datagrampacket=new DatagramPacket(msg.getBytes(), msg.length(),ip,999);
		datagramscoket.send(datagrampacket);
		datagramscoket.close();
	}

}
