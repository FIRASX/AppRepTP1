import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;


public class client {
	public static void main(String[]args) {
		try {
				InetAddress inetAdd = InetAddress.getByName("10.27.13.172");
				InetSocketAddress isa = new InetSocketAddress(inetAdd, 1234);
				
				Socket s= new Socket();
				s.connect(isa);
				System.out.println("je suis un client connecté");
				
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				
				System.out.println("donner un nombre");
				Scanner scanner= new Scanner(System.in);
				int nb = scanner.nextInt();
				os.write(nb);
				System.out.println("le resultat=" + is.read());
				
				System.out.println("déconnextion");
				
				s.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

}
}
