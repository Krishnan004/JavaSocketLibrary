package Scoket.Learning;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class datagramclient {

	public static void main(String[] args) throws IOException {
		DatagramSocket datagramscoket=new DatagramSocket(999);
		byte[] buffer=new byte[1024];
		
		DatagramPacket datagramPacket=new DatagramPacket(buffer,1024 );
		datagramscoket.receive(datagramPacket);
		
		String msg=new String(datagramPacket.getData(),0,datagramPacket.getLength());
		System.out.println(msg);
		
		datagramscoket.close();
	}
}
