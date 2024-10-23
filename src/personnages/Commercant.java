package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonPreferee, int argent) {
		super(nom, "the", argent);

	}

	public int seFaireExtorquer() {
		String texte;
		texte = "J'ai tout perdu! Le monde est trop injuste...";
		this.parler(texte);
		int argentAvant = this.getArgent();
		this.perdreArgent(argentAvant);
		return argentAvant;
	}
	
	public void recevoir(int argent) {
		String texte;
		texte = argent + " sous! Je te remercie genereux donateur!";
		this.gagnerArgent(argent);
		this.parler(texte);
	}

}
