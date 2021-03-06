
public class Rahtilaiva extends Laiva {
	
	protected final double kapasiteetti;
	protected double rahti;
			
	public Rahtilaiva(String name, int length, int draft, 
			int speedKnots, double rahti, double kapasiteetti){
		
		//asetetaan kutsumalla yläluokkaa
		super(name, length, draft, speedKnots);
		this.kapasiteetti = kapasiteetti;
		//tyhjennetään laiva, jos rahtia on yli kapasiteetin
		if (rahti <= kapasiteetti){
			this.rahti = rahti; 
		}
		else this.rahti = 0;
		//vähennetään nopeutta suhteessa rahdin määrään
		speedKnots = (int) ((int) speedKnots - ((rahti / kapasiteetti) * 10));
	}

}
