package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int somme = (int) (this.getArgent() * 0.1);
		String texte;
		texte = beneficiaire.getNom() + " prend ces " + somme + " sous.";
		this.parler(texte);
		beneficiaire.recevoir(somme);
	}

}
