import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
	public static void main(String[]args) {
		try {
			ServerSocket ssk = new ServerSocket(1234);
			System.out.print("je suiss un serveur,j'attend un client");
			Socket sk = ssk.accept();
			System.out.println("un client est connecte!");
			
			InputStream is = sk.getInputStream();
			OutputStream os = sk.getOutputStream();
			int nb = is.read();
			int rep = nb*5;
			os.write(rep);
			sk.close();
			ssk.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
