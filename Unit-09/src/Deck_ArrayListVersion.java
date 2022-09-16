import java.util.*;
import java.math.*;
//import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck_ArrayListVersion {

	private List<Card> cards;

	private int size;


	public Deck_ArrayListVersion() {
		size = 0;
		cards = new ArrayList<Card>();
	}
	
	public Deck_ArrayListVersion(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		size = suits.length * ranks.length;
		cards = new ArrayList<Card>();
		for (String suit : suits) {
			for (int i = 0; i < values.length; i++) {
				cards.add(new Card(ranks[i], suit, values[i]));
			}
		}
		shuffle();
	}


	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size <= 0;
	}


	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
			
		int len = cards.size() - 1;
		for (int k = len; k > 0; k--) {
			int loc = (int)(Math.random()*len);
			Card temp = cards.get(loc);
			cards.set(loc, cards.get(k));
			cards.set(k, temp);
		}
		size = cards.size();
	}

	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (isEmpty()) {
			return null;
		}
		
		size--;
		return cards.get(size);
	}
	
	//See all cards in one column
	public void seeDeck() {
		for (int i = 0; i < cards.size(); i++) {
			System.out.println(cards.get(i));
		}
	}
	

	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k); //Originally ran = ran + cards.get(k)
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) { //Originally int k = cards.size() - 1; k >= size; k--
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
