public class Laiva{
  

  private String name;
  private int length;
  private int draft;
  private int speedKnots;
  
  public Laiva(String name, int length, int draft, int speedKnots){
    this.name = name;
    this.length = length;
    this.draft = draft;
    this.speedKnots = speedKnots;
  }
  public double travelTimeMinutes(double distanceKm){
    if (speedKnots == 0){
      return 0;
    }
    double speedKmph = speedKnots * 1.852;
    double minutes = (distanceKm / speedKmph) * 60;
    return minutes;
    }
  }

    
               