package appmeteo;

public class AfficheurMobile implements Observateur {

	@Override
	public void actualiser(double temperature) {
		System.out.println("App mobile : " + temperature + "°C");
	}

}
