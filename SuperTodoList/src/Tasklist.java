/**
 * Définition d'une liste de tâches
 */

/**
 * @author nonor
 *
 */
public class Tasklist {
	public Task[] tasks = new Task[10];
	public int nbTasks=0;
	
	/**
	 * Affichage d'une lliste de tâche sous forme  de chaîne de caractéres
	 * 
	 * @return La liste des tâches et leur état
	 */
	public String toString() {
		String result = "";
		
		for (int i = 0; i < nbTasks; i++) {
			result += i + 1 +"/" + nbTasks + ": " + tasks[i] + "\n";
			}
		return result;
	}

}
