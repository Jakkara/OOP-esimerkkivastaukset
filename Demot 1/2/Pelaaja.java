public class Pelaaja{
  /*Toteuta luokat Pelaaja ja Joukkue. 
   * Pelaajalla tulee olla attribuutit nimi, numero ja pelipaikka
(hy�kk��j�, puolustaja tai maalivahti). */
  
  public String name;
  public int number;
  public String position;
  
  public Pelaaja(String name, int number, String pos){
    this.name = name;
    this.number = number;
    switch (pos){
      case "ATT":
        position = "hy�kk��j�";
        break;
      case "DEF":
        position = "puolustaja";
        break;
      case "GL":
        position = "maalivahti";
        break;
    }
  }
    public String playerInfo(){
      return (name  +  ", #" + number + ", " + position);
   }
    public int jersey(){
      return number;
    }
}

