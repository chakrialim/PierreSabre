package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
	}
	
	public void setClan(String clan) {
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		String texte;
		texte = "Tiens, tiens, ne serait-il pas un faible marchand qui passe par la? ";
		this.parler(texte);
		texte = victime.getNom() + ", si tu tiens à la vie donne moi ta bourse! ";
		this.parler(texte);
		int somme =	victime.seFaireExtorquer();
		this.gagnerArgent(somme);
		texte = "J'ai pique les " + somme + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !";
		this.parler(texte);
		reputation++;
		
	}
		
	
}
