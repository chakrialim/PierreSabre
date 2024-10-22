package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
	}
	
	public void extorquer(Commercant victime) {
		String texte;
		texte = "Tiens, tiens, ne serait-il pas un faible marchand qui passe par la?";
		victime.seFaireExtorquer();
		reputation++;
		this.parler(texte);
	}
		
	
}
