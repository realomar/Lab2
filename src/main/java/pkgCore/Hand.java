package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand(){
		
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		
		for (Card c: cards){
			if(c.geteRank().getiRankNbr()<11){
				iScore[0] += c.geteRank().getiRankNbr();
				iScore[1] += c.geteRank().getiRankNbr();
			}
			else if(c.geteRank().getiRankNbr()<14) {
				iScore[0] += 10;
				iScore[1] += 10;
			}
			else {
				iScore[0] += 1;
				iScore[1] += 11;
			}
			//	TODO: Determine the score.  
			//			Cards:
			//			2-3-4 - score = 9
			//			5-J-Q - score = 25
			//			5-6-7-2 - score = 20
			//			J-Q	- score = 20
			//			8-A = score = 9 or 19
			//			4-A = score = 5 or 15
			
		}
		
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		//	TODO: add a card to 'cards' from a card drawn from Deck d
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
