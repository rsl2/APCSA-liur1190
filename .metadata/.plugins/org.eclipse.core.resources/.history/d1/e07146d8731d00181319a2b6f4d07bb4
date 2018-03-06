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
		String[] rank1 = {"Jack", "Queen", "King"};
		String[] suit1 = {"Hearts", "Spades", "Diamonds"};
		int[] value1 = {11, 12, 13};
		
		Deck deck1 = new Deck(rank1, suit1, value1);
		System.out.println("Deck1 size should be 9: " + deck1.size());
		
		String[] rank2 = {"Ace", "2", "3"};
		String[] suit2 = {"Clubs", "Spades", "Hearts"};
		int[] value2 = {1, 2, 3};
		
		Deck deck2 = new Deck(rank2, suit2, value2);
		System.out.println("Deck2 should not be empty: " + !deck2.isEmpty());
		
		String[] rank3 = {"4", "Jack", "King"};
		String[] suit3 = {"Diamonds", "Clubs", "Spades"};
		int[] value3 = {4, 11, 13};
		
		Deck deck3 = new Deck(rank3, suit3, value3);
		System.out.println("Deck3 dealt card is " + deck3.deal());
		System.out.println(deck3);
		
		String[] rank4 = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit4 = {"Clubs", "Diamonds", "Hearts", "Spades"};
		int[] value4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		Deck deck4 = new Deck(rank4, suit4, value4);
		deck4.shuffle();
		System.out.println(deck4);
	}
}
