package blackjackGame;

public class Player{
	
	private Hand hand;

	//constructor
	public Player(Hand hand) {
		super();
		this.hand = hand;
	}
	//get+set
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	
}
