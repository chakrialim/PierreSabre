package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitise = 0;

	public Traitre(String seigneur, String nom, String boissonPreferee, int argent) {
		super(seigneur, nom, boissonPreferee, argent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		String texte;
		texte = "Mais je suis un traitre et mon niveau de traitre est: " + niveauTraitise + ". Chut!";
		parler(texte);
	}

	public void ranconner(Commercant commercant) {
		if (niveauTraitise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant * 2 / 10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentCommercant);
			niveauTraitise++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne-moi " + argentRanconner
					+ "sous ou gare a toi!");
			commercant.parler("Tout de suite grand " + commercant.getNom() + ".");
		} else {
			parler("Mince je ne peux plus rqnconner personne sinon un samourai risque de me demasquer !");
		}

	}

	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne veux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			Random rand = new Random();
			int numeroConnaissance = rand.nextInt();
			Humain ami = memoire[numeroConnaissance];
			int don = getArgent() * 1/20;
			String nomAmi = ami.getNom();
			parler("Bonjour l'ami")
			
		}
	}
	
}
