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
		RDV t = new RDV("Test", 1, 10, 2014, 10, 30);
		
		System.out.println(t);
		if (t.isLate()) {
			System.out.println("Trop tard");
		}
	}
}
