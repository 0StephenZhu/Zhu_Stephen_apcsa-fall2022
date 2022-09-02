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
		
		String[][] testCasesRanks = {
			{"jack", "queen", "king"},
			{"A", "B", "C"},
			{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"}
		};
		
		String[][] testCasesSuit = {
			{"blue", "red"},
			{"Giraffes", "Lions"},
			{"club", "diamond", "heart", "spade"}
		};
		
		int[][] testCasesPointValue = {
			{11, 12, 13},
			{2,1,6},
			{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}
		};
		
		Deck temp;
		
		for (int i = 0; i < testCasesRanks.length; i++) {
			temp = new Deck(testCasesRanks[i], testCasesSuit[i], testCasesPointValue[i]);
			//temp.seeDeck();
			System.out.println(temp.isEmpty());
			System.out.println(temp.size());
			System.out.println(temp.deal());
			System.out.println(temp);
			temp.shuffle();
			System.out.println(temp);
		}
		
	}
}
