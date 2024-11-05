package personnages;

public class Humain {
	private String nom;
	private String boissonPreferee;
	protected int argent;
	
	public void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte );
	}
	

	public Humain(String nom, String boissonPreferee, int argent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
		this.direBonjour();
	}


	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoissonPreferee() {
		return boissonPreferee;
	}
	
	public void direBonjour() {
		String texte;
		texte = "Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoissonPreferee();
		parler(texte);
	}
	
	public void boire() {
		String texte;
		texte = "Mmmm, un bon verre de " + getBoissonPreferee() + " ! GLOUPS!";
		parler(texte);
	}
	
	public void acheter(String bien, int prix) {
		String texte;
		if (argent>=prix) {
			texte = "J'ai " + getArgent() + " sous en poche. Je vais m'offrir un " + bien + " a " + prix + " sous";
			perdreArgent(prix);
		} else {
			texte = "Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux m�me pas m'offrir un " + bien + " a " + prix + " sous."; 
		}
		parler(texte);
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
}
