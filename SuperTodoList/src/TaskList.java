/**
 * Définition d'une liste de tâches
 */

/**
 * @author nonor
 *
 */

import java.util.ArrayList;

public class TaskList {
	private ArrayList<Task> tasks = new ArrayList<>();
	
	
	/**
	 * Affichage d'une lliste de tâche sous forme  de chaîne de caractéres
	 * 
	 * @return La liste des tâches et leur état
	 */
	public String toString() {
		String result = "";
		int len = tasks.size();
		
		for (int i = 0; i < len; i++) {
			result += i + 1 +"/" + len + ": " + tasks.get(i) + "\n";
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
		return tasks.add(newTask);
	}
	/**
	 * Ajout d'une tâche simple
	 * 
	 * @param label Label de la tâche à ajouter
	 * @return <ul>
	 * 			<il>true : la tâche a été ajouté</il>
	 * 			<il>false : la tâche n'a pas été ajouté</il>
	 * 
	 */
	public Boolean addTask(String label){
		SimpleTask newTask = new SimpleTask(label);
		return addTask(newTask);
	}
	/**
	 * Ajout d'un rendez-vous
	 * 
	 * @param label Label de la tâche à ajouter
	 * @return <ul>
	 * 			<il>true : la tâche a été ajouté</il>
	 * 			<il>false : la tâche n'a pas été ajouté</il>
	 * 
	 */
	public Boolean addTask(String label, int day, int month, int year, int hour, int minutes){
		RDV newTask = new RDV(label,  day,  month,  year,  hour,  minutes);
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
		if ((idTask < 0) || (idTask >= tasks.size())) {
			return false;			
		} else {
			tasks.get(idTask).done();
			return true;		
		}
	}

}
