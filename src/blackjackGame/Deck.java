package blackjackGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<Card>(52);
    
	public Deck(){
		System.out.println("*** Shuffled Cards ***");
		this.deck = shuffleDeck();
	}
	
	public List<Card> shuffleDeck(){
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
		Collections.shuffle(deck);
	
		return deck;
		
	}
	
	
	public Card dealCard(){
		Card card = deck.get(0);
		
		deck.remove(0);
		System.out.println(card);
		return card;
	}

	//GET+SET

	public List<Card> getDeck() {
		return deck;
	}


	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
	
}
