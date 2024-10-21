package appmeteo;

public class AfficheurWeb implements Observateur {

	@Override
	public void actualiser(double temperature) {
		System.out.println("App web : " + temperature + "°C");
	}

}
