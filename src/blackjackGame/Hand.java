package blackjackGame;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;

public class Hand {
	private String player;
	List<Card> hand = new ArrayList<>();

	// constructor
	public Hand(String player) {
		this.player = player;
	}
	// methods
	public void addCard(Deck deck){
		 hand.add(deck.dealCard());
		
	}
	
	public int calcCardPoints(){
		int handPoints = 0;
		for (Card card : this.hand) {
			handPoints += card.getCardPoints();
		}
		return handPoints;
	}
	//get+set
	public String getPlayer() {
		return player;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	
	

}
