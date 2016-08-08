package blackjackGame;

//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Card {

	public Rank cardRank;
	public Suit cardSuit;
	public int cardPoints;

	Map<Rank, Integer> rankToPoints = new HashMap<>(13);
	
	public void cardValue(){
		rankToPoints.put(Rank.TWO, 2);
		rankToPoints.put(Rank.THREE, 3);
		rankToPoints.put(Rank.FOUR, 4);
		rankToPoints.put(Rank.FIVE, 5);
		rankToPoints.put(Rank.SIX, 6);
		rankToPoints.put(Rank.SEVEN, 7);
		rankToPoints.put(Rank.EIGHT, 8);
		rankToPoints.put(Rank.NINE, 9);
		rankToPoints.put(Rank.TEN, 10);
		rankToPoints.put(Rank.JACK, 10);
		rankToPoints.put(Rank.QUEEN, 10);
		rankToPoints.put(Rank.KING, 10);
		rankToPoints.put(Rank.ACE, 11);
	}


	public Card(Rank r, Suit s) {
		cardValue();
		cardRank = r;
		cardSuit = s;
		this.setCardPoints(rankToPoints.get(cardRank));
		
	}


	public Rank getCardRank() {
		return cardRank;
	}


	public Suit getCardSuit() {
		return cardSuit;
	}


	public int getCardPoints() {
		return cardPoints;
	}


	public Map<Rank, Integer> getRankToPoints() {
		return rankToPoints;
	}


	public void setCardRank(Rank cardRank) {
		this.cardRank = cardRank;
	}


	public void setCardSuit(Suit cardSuit) {
		this.cardSuit = cardSuit;
	}


	public void setCardPoints(int cardPoints) {
		this.cardPoints = cardPoints;
	}


	public void setRankToPoints(Map<Rank, Integer> rankToPoints) {
		this.rankToPoints = rankToPoints;
	}


	@Override
	public String toString() {
		return (cardRank +" "+ cardSuit).toLowerCase();
	}
	


	

	
	
	
}
		
