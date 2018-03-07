package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();

	public Hand() {

	}

	public int[] ScoreHand() { // Assumes that a hand will only contain 1 ACE

		int[] iScore = new int[2];

		iScore[0] = 0;
		iScore[1] = 0;


		for (Card c : cards) {
			if (c.geteRank().getiRankNbr() < 11) {
				iScore[0] += c.geteRank().getiRankNbr();
				iScore[1] += c.geteRank().getiRankNbr();
			} else if (c.geteRank().getiRankNbr() < 14) {
				iScore[0] += 10;
				iScore[1] += 10;
			} else {
				iScore[0] += 1;
				iScore[1] += 11;
			}
			// DONE: Determine the score.
			// Cards:
			// 2-3-4 - score = 9
			// 5-J-Q - score = 25
			// 5-6-7-2 - score = 20
			// J-Q - score = 20
			// 8-A = score = 9 or 19
			// 4-A = score = 5 or 15

		}
		if (iScore[0] == iScore[1]) {
			this.iScore = iScore[0];
			
		} else { // The score is equivalent to the highest score that is not greater than 21
			if (Math.max(iScore[0], iScore[1]) > 21)
				this.iScore = Math.min(iScore[0], iScore[1]);
			else
				this.iScore = Math.max(iScore[0], iScore[1]);
		}
		return iScore;

	}

	public void Draw(Deck d) {
		// DONE: add a card to 'cards' from a card drawn from Deck d
		try {
			cards.add(d.Draw());
		} catch (Exception e) {
			// The deck is empty
			try {
				cards.add(new Deck().Draw()); // Draws a random card.
			} catch (Exception e2) {
				// This should never occur since the drawn card is from a new deck with 52
				// cards.
			}
		}

	}

	private void AddCard(Card c) {
		cards.add(c);
	}

}
