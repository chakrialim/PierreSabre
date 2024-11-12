package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	private int force = 2 * honneur;

	public Ronin(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int somme = (int) (getArgent() * 0.1);
		String texte;
		texte = beneficiaire.getNom() + " prend ces " + somme + " sous.";
		parler(texte);
		beneficiaire.recevoir(somme);
	}
	
	public void provoquer(Yakuza adversaire) {
		int repAdversaire = adversaire.getReputation();
		String texte;
		texte = "Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand! ";
		parler(texte);
		if (force >= repAdversaire) {
			honneur++;
			texte = "Je t'ai eu petit yakusa!";
			parler(texte);
			gagnerArgent(adversaire.perdre());
			
		} else {
			honneur--;
			texte = "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup. ";
			parler(texte);
			adversaire.gagner(getArgent());
			
		}
		
	}

}
