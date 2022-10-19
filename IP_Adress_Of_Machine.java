package Program_practise;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP_Adress_Of_Machine {

	public static void main(String[] args) throws Throwable {

        InetAddress IP = InetAddress.getLocalHost();
   
        System.out.println("IP of my system is := "+IP.getHostAddress());

	}

}
