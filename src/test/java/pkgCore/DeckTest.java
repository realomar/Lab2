package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		//	DONE: Build a deck(1), make sure there are 52 cards in the deck
		Deck d1 = new Deck(1);
		System.out.println(d1.DeckSize());
		if(d1.DeckSize() != 52) {
			fail("Deck is the wrong size");
		}
	
		//	DONE: Build a deck(6), make sure there are 312 cards in the deck 
		Deck d2 = new Deck(6);
		if(d2.DeckSize() != 312) {
			fail("Deck is the wrong size");
		}
	}

}
