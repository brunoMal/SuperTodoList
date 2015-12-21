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
		TaskList list = new TaskList();
		
		list.addTask("Test", 1, 10, 2014, 10, 30);
		list.addTask("Test2");
		
		System.out.println(list);
		
	}
}
