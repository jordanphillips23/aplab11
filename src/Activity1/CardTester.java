package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card a = new Card("a", "b", 10);
		System.out.println(a.toString());
		Card b = new Card("a", "b", 10);
		System.out.println(b.toString());
		System.out.println(b.matches(a));
		Card c = new Card("l", "q", 11);
		System.out.println(c.equals(a));
	}
}
