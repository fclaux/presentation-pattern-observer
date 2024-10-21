package appmeteo;

public class AppMeteo {

	public static void main(String[] args) {
		StationMeteo station = new StationMeteo();
		
		Observateur afficheurMobile = new AfficheurMobile();
		Observateur afficheurWeb = new AfficheurWeb();
		
		System.out.println("-----Sans observateur-----------------------------");
		station.setTemperature(12);
		
		station.ajouterObservateur(afficheurMobile);
		station.ajouterObservateur(afficheurWeb);
		
		System.out.println("-----Avec deux observateurs-----------------------");
		station.setTemperature(14);
		
		station.supprimerObservateur(afficheurWeb);
		
		System.out.println("-----Avec seulement l'observateur mobile----------");
		station.setTemperature(22.452);
	}
}
