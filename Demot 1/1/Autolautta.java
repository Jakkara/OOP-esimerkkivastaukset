public class Autolautta extends Laiva {
	
	protected final int kapasiteetti;
	protected int matkustajat;
	protected int ajoneuvot;
	
	public Autolautta(String name, int length, int draft, int speedKnots,
			int passengers, int vehicles, int capacity){
		
		//asetetaan kutsumalla yläluokkaa
		super(name,length,draft,speedKnots);
		//tarkistetaan kapasiteetin kelpuus
		if ((capacity <= 20) && (capacity > 0)){
			kapasiteetti = capacity;
		}
		else kapasiteetti = 0;
		
		matkustajat = passengers;
		ajoneuvot = vehicles;
		
		
		int test = 10* vehicles + matkustajat;
		if (test > kapasiteetti){
			matkustajat = 0;
			ajoneuvot = 0;
			System.out.println("Kapasiteetti ylitetty, kaikki ulos.");
		}
		if (test < 0){
			matkustajat = 0;
			ajoneuvot = 0;
			System.out.println("Jossain pahasti vikaa.");
		}
	}

}
