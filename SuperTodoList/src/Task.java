/**
 * 
 */

/**
 * Définition d'une tâche
 * 
 * @author nonor
 *
 */
public class Task {
	public String label;
	public Boolean state;
	
	public Task() {
		
	}
	/**
	 * Constructeur d'une tâche
	 * @param label Description de la tâche
	 * @param state Etat de la tâche
	 */
	public Task(String label, Boolean state) {
		this.label=label;
		this.state=state;
	}
}
