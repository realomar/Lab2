package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	//  TODO: Add eRank and eSuit as attributes.
	private eRank eRank;
	private eSuit eSuit;
	
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	public Card(eRank eRank, eSuit eSuit) {
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	
	
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return 0;
		//return c.geteRank().compareTo(this.geteRank());

}
	
}
