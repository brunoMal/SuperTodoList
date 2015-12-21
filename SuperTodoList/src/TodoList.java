/**
 * 
 */

/**
 * @author nonor
 *
 */
public class TodoList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t = new Task("Test", false);
		
		System.out.println(t);
		//t.done();

		if (t.isDone()) {
			System.out.println("Tâche éffectué !");
		} else {
			System.out.print("Tâche à faire !");

		}
	}

}
