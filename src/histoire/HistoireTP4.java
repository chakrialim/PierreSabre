package histoire;
import personnages.Humain;
import personnages.Ronin;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha", 54);
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		
		Commercant marco = new Commercant("Marco",20);	
		marco.getBoissonPreferee();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();

		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir","whisky", 30);
		yakuLeNoir.setClan("Warsong");
		yakuLeNoir.extorquer(marco);
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.donner(marco);
		roro.provoquer(yakuLeNoir);
		
	}

}
 