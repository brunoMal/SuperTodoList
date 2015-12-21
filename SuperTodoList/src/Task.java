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
	/**
	 * Affichage d'une tâche sous forme de de chaîne de caractéres
	 * 
	 * @return Le nom de la tâche suivi de son état
	 * 
	 */
	public String toString() {
		return "Tâche '" + this.label + "' => " + this.state;
	}
	
	/**
	 * Passage d'une tâche à l'état "fait"
	 * 
	 */
	public void done() {
		state=true;
	}
	
	/**
	 * Indique l'état de la tâche
	 * 
	 * @return Etat de la Tâche:<ul>
	 * 		<li>true : fait</li>
	 * 		<li>false : à faire</li>
	 * 		</ul>
	 * 
	 */
	public Boolean isDone() {
		return state;
	}
}
