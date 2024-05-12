package Scoket.Learning;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;



public class socketexample {

	public static void main(String[] args) throws IOException{
		Socket scoket=new Socket("Localhost",999);
		
		DataInputStream datainp=new DataInputStream(scoket.getInputStream());
		String msg=datainp.readUTF();
		System.out.println("Server says: "+msg);
	}
}
