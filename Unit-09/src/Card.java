/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}

	public String suit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return suit;
   }

	public String rank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return rank;
	}

	public int pointValue() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		if (suit.equals(otherCard.suit()) && rank.equals(otherCard.rank()) && pointValue == otherCard.pointValue()) {
			return true;
		}
		return false;
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}
