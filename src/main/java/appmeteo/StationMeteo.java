package appmeteo;
import java.util.ArrayList;
import java.util.List;

public class StationMeteo implements Sujet {
	
	private List<Observateur> observateurs;
	private double temperature;
	
	public StationMeteo() {
		this.observateurs = new ArrayList<>();
	}

	@Override
	public void ajouterObservateur(Observateur o) {
		observateurs.add(o);
	}

	@Override
	public void supprimerObservateur(Observateur o) {
		observateurs.remove(o);
		
	}

	@Override
	public void notifierObservateurs() {
		for (Observateur observateur : observateurs) {
			observateur.actualiser(temperature);
		}
	}
	
	public void setTemperature(double nouvelleTemperature) {
		this.temperature = nouvelleTemperature;
		notifierObservateurs();
	}
}
