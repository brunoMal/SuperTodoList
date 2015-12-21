/**
 * Définition d'une tâche de type rendez-vous
 * 
 */

/**
 * @author nonor
 *
 */
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Calendar;

public class RDV extends Task {
	protected GregorianCalendar date;
	public RDV(String label, int day, int month, int year, int hour, int minutes) {
		super(label);
		date = new GregorianCalendar(TimeZone.getTimeZone("Europe/paris"));
		date.set(year,  month, day, hour, minutes, 0);
		
	}
	/**
	 * Affichage d'un rendez-vous sous forme de chaîne de caractéres
	 * 
	 * @return Le nom du RDV suivi de la date, de l'heure et de l'état
	 * 
	 */
	@Override
	public String toString() {
		String done;
		
		if (isDone()) {
			done = "(éffectuée)";
			
		} else {
			done = "(à faire)";

		}
		
		return "Rende-vous \"" + getLabel() + "\" le " + date.get(Calendar.DAY_OF_MONTH) 
		+ "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR) + " à " 
		+ date.get(Calendar.HOUR) + ":" + date.get(Calendar.MINUTE) + " " + done;
		
	}
	/**
	 * Vérifie si un rendez-vous est dépassé ou non
	 * 
	 * @return <ul>
	 * 			<il>true : rendez-vous dépassé</il>
	 * 			<il>false : rendez-vous toujours valide</il>
	 * 
	 */
	public Boolean isLate() {
		GregorianCalendar now = new GregorianCalendar(TimeZone.getTimeZone("Europe/paris"));
		if (date.compareTo(now)==-1) {
			return true;
		} else{
			return false;
		}
	}

}
