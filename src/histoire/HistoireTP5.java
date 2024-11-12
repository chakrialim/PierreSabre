package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",20);
		Ronin roro = new Ronin("Roro", "shochu",60);
		marco.faireConnaissanceAvec(roro);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		marco.faireConnaissanceAvec(yaku);
		Commercant chonin = new Commercant("Chonin",40);
		marco.faireConnaissanceAvec(chonin);
		Commercant kumi = new Commercant("Kumi",10);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		
		

	}

}
