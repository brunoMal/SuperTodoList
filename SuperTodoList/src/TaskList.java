/**
 * Définition d'une liste de tâches
 */

/**
 * @author nonor
 *
 */
public class TaskList {
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
	
	/**
	 * Ajout d'une tâche
	 * 
	 * @param newTask Tâche à ajouter
	 * @return <ul>
	 * 			<il>true : la tâche a été ajouté</il>
	 * 			<il>false : la tâche n'a pas été ajouté</il>
	 * 
	 */
	public Boolean addTask(Task newTask){
		if (nbTasks == 10) {
			return false;
		} else {
			tasks[nbTasks++] = newTask;
			return true;
		}
	}
	/**
	 * Ajout d'une tâche
	 * 
	 * @param label Label de la tâche à ajouter
	 * @return <ul>
	 * 			<il>true : la tâche a été ajouté</il>
	 * 			<il>false : la tâche n'a pas été ajouté</il>
	 * 
	 */
	public Boolean addTask(String label){
		Task newTask = new Task(label);
		return addTask(newTask);
	}
	/**
	 * Passage d'une tâche de la liste à l'état "fait"
	 * 
	 * @param idTask Index de la tâche dans la liste
	 * @return <ul>
	 * 			<li>true : la tâche a été noté comme éffectué</li>
	 * 			<li>false : l'état n'a pazs pu être modifié</li>
	 * 			</ul>
	 * 
	 */
	public Boolean taskDone(int idTask){
		if ((idTask < 0) || (idTask >= nbTasks)) {
			return false;			
		} else {
			tasks[idTask].done();
			return true;		
		}
	}

}
