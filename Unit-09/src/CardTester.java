/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card[] testCases = {
			new Card("king", "heart", 10),
			new Card("ace", "spade", 1),
			new Card("4", "diamond", 4)
		};
		
		
		for (Card test : testCases) {
			System.out.println(test);
		}
		
		
	}
}
