package Scoket.Learning;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;


public class ServerScoketExample {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serversocket=new ServerSocket(999);
		Socket scoket=serversocket.accept();
		
		DataOutputStream dataout=new DataOutputStream(scoket.getOutputStream());
		dataout.writeUTF("Hi Client");
		
		dataout.close();
	}

}
