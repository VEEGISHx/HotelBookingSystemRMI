import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import RoomManagerInterface.RoomManager;

public class HotelServer {
	public HotelServer() {
		try {
			Registry r = LocateRegistry.createRegistry(1099);
			RoomManager rm = new RoomManagerImpl();
			Naming.rebind("rmi://localhost:1099/BookingService", rm);
			System.out.println("Booking Service Ready...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])throws Exception{
	   new HotelServer();
	}
}
