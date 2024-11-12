package personnages;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String seigneur, String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
		this.seigneur = seigneur;
	}
	
	 
	@Override
	public void direBonjour() {
		super.direBonjour();
		String texte;
		texte = "Je suis fier de servir le seigneur " + seigneur;
		parler(texte);
	}
	
	public void boire(String boisson) {
		String texte;
		texte = "Qu'est-ce que je vais choisir comme boisson? Tiens je vais prendre du " + boisson + ".";
		parler(texte);
	}

}
