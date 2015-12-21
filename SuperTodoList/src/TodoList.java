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
		TaskList list = new TaskList();
		
		list.addTask("Test");
		list.addTask("Test 2");
		
		list.taskDone(0);
		
		System.out.println(list);
		list.tasks[0].label = "label modifié";
		
		System.out.println(list.tasks[0]);
	}
}
