package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonPreferee, int argent, String clan) {
		super(nom, boissonPreferee, argent);
		this.clan = clan;
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		String texte;
		texte = "Tiens, tiens, ne serait-il pas un faible marchand qui passe par la? ";
		//this.parler(texte);
		parler(texte);
		texte = victime.getNom() + ", si tu tiens a la vie donne moi ta bourse! ";
		parler(texte);
		int somme =	victime.seFaireExtorquer();
		gagnerArgent(somme);
		texte = "J'ai pique les " + somme + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !";
		parler(texte);
		reputation++;
	}
	
	public int perdre() {
		String texte;
		int argentAvant = getArgent();
		perdreArgent(argentAvant);
		reputation--;
		texte = "J'ai perdu mon duel et mes " + argentAvant + " sous, snif... J'ai dehonore le clan de " + getClan() + ".";
		parler(texte);
		return argentAvant;
	}
	
	public void gagner(int gain) {
		String texte;
		gagnerArgent(gain);
		reputation++;
		texte = "Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + getClan() + " ? Je l'ai depouille de ses " + gain + " sous.";
		parler(texte);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		String texte;
		texte = "Mon clan est celui de Warsong";
		parler(texte);
	}
	
		
	
}
