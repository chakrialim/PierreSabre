package personnages;

public class Humain {
	private static final int MAX_CONNAISSANCE = 30;
	private String nom;
	private String boissonPreferee;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[MAX_CONNAISSANCE];

	public Humain(String nom, String boissonPreferee, int argent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
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

	protected void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte);
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
		if (argent >= prix) {
			texte = "J'ai " + getArgent() + " sous en poche. Je vais m'offrir un " + bien + " a " + prix + " sous";
			perdreArgent(prix);
		} else {
			texte = "Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux m�me pas m'offrir un " + bien
					+ " a " + prix + " sous.";
		}
		parler(texte);
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	private void memoriser(Humain autreHumain) {
		if (nbConnaissance < MAX_CONNAISSANCE) {
			memoire[nbConnaissance] = autreHumain;
			nbConnaissance++;
		} else {
			for (int i = 0; i < memoire.length - 1; i++) {
				memoire[i] = memoire[i + 1];
			}
			memoire[memoire.length - 1] = autreHumain;
		}
	}

	private void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);

	}

	public void listerConnaissance() {
		StringBuilder texte = new StringBuilder();
		texte.append("Je connais beaucoup de monde dont: ");
		for (int i = 0; i < nbConnaissance; i++) {
			if (i == nbConnaissance - 1) {
				texte.append(memoire[i].toString());
			} else {
				texte.append(memoire[i] + ", ");
			}
		}
		String texteString = texte.toString();
		parler(texteString);
	}

	@Override
	public String toString() {
		return nom;
	}
}
