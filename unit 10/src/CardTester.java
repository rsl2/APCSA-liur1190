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
		Card c1 = new Card("9", "Spade", 9);
		Card c2 = new Card("Queen", "Heart", 12);
		Card c3 = new Card("9", "Spade", 9);
		
		System.out.println(c2);
		System.out.println("Card 1 and card 3 should match: " + c1.matches(c3));
		
	}
}
