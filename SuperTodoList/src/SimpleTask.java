/**
 * Définition d'une tâche simple
 * 
 * @author nonor
 *
 */
public class SimpleTask extends Task{
	/**
	 * Constructeur d'une tâche
	 * 
	 * @param label Description de la tâche
	 */
	public SimpleTask(String lable) {
		super(lable);
	}
	
	/**
	 * Affichage d'une tâche sous forme de chaîne de caractéres
	 * 
	 * @return Le nom de la tâche suivi de son état
	 */
	public String toString() {
		String done;
		
		if (isDone()) {
			done = "(éffectué)";
		} else {
			done = "(à faire)";
		}
		return "tâche simple : " + getLabel() + "" + done;
	}

}
