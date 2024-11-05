package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonPreferee, int argent) {
		super(nom, "the", argent);

	}

	public int seFaireExtorquer() {
		String texte;
		texte = "J'ai tout perdu! Le monde est trop injuste...";
		parler(texte);
		int argentAvant = argent;
		perdreArgent(argentAvant);
		return argentAvant;
	}
	
	public void recevoir(int argent) {
		String texte;
		texte = argent + " sous! Je te remercie genereux donateur!";
		gagnerArgent(argent);
		parler(texte);
	}

}
