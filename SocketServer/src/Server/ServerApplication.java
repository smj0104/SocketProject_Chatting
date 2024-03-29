package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerApplication {
	private final static int PORT = 9090;
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(PORT);
			System.out.println("==========<<server start>>==========");
			
			while(true){
				Socket socket = serverSocket.accept();
				System.out.println("연결확인");
				SocketServer socketServer = new SocketServer(socket);
				socketServer.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
