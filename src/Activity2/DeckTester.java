package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck a = new Deck(new String[] {"a", "b"}, new String[] {"c", "d"}, new int[] {1, 2, 3});
		System.out.println(a.deal());
		System.out.println(a.toString());
		System.out.println(a.size());
		Deck b = new Deck(new String[] {"b"}, new String[] {"d"}, new int[] {2, 3});
		System.out.println(b.deal());
		System.out.println(b.toString());
		System.out.println(b.size());
		Deck c = new Deck(new String[] {"c","d","a","q", "1","d","2"}, new String[] {"2"}, new int[] {3});
		System.out.println(c.deal());
		System.out.println(c.toString());
		System.out.println(c.size());
	}
}
