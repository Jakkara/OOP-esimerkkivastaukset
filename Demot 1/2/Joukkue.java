import java.util.ArrayList;
public class Joukkue{
  /*Joukkue sis‰lt‰‰ n pelaajaa, ja sen tulee sis‰lt‰‰
toiminnallisuudet pelaajien lis‰‰miseksi tai poistamiseksi joukkueesta. 
Lis‰ksi Joukkue-luokan tulee sis‰lt‰‰ metodi, 
jonka avulla voidaan tulostaa ruudulle kaikki joukkueen
pelaajat tietoineen. */
  
private ArrayList<Pelaaja> team = new ArrayList<Pelaaja>();

  public Joukkue(){
    addPlayer("Jukka", 1, "ATT");
    addPlayer("Pekka", 2, "DEF");
    addPlayer("Jussi", 3, "GL");
    
  
  }
  public void removePlayer(int number){
    for (int i = 0; i < team.size(); i++){
      if (team.get(i).jersey() == number){
        team.remove(i);
      }
  }
  }
  public void addPlayer(String name, int number, String position){ //Lis‰t‰‰n haluttuun joukkueeseen uusi pelaaja
    team.add(new Pelaaja(name, number, position));
  }
  public void playerList(){ //Tulostetaan kaikista pelaajista tiedot
    String information = "";
    for (int i = 0; i < team.size(); i++){
      information = team.get(i).playerInfo();
      System.out.println(information);
    }
}
}