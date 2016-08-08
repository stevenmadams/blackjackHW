package blackjackGame;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class GameLogic {
private Deck deck;
private Player player;
private Player dealer;
Scanner keyboard = new Scanner(System.in);
List<Hand> players = new ArrayList<>();


public GameLogic(){
	this.deck = new Deck();
	Hand player = new Hand("player");
	Hand dealer = new Hand("dealer");
	players.add(player);
	players.add(dealer);

}

public void dealPlayer(){
	
	System.out.println("---------------");
	for (Hand hand : players) {
		hand.addCard(deck);
		hand.addCard(deck);
		System.out.println("---------------");
	} 	
	
	
	showPlayer();
	showDealer();
	if (someoneWins()) {
		dealPlayer();
	} else {
		showOptions(players.get(0), players.get(1));
	}
}

private boolean someoneWins() {
	if(players.get(0).calcCardPoints() > 21 ){
		System.out.println("You went over! Dealer wins!");
		System.exit(0);
	}
	
	if(players.get(1).calcCardPoints() > 21 ){
		System.out.println("Dealer went over! You win!");
	}
	
	if (players.get(0).calcCardPoints() == 21)
	{System.out.println("Player has won!");
	System.exit(0);}
	if (players.get(1).calcCardPoints() == 21)
	{System.out.println("Dealer has won!");
	System.exit(0);}
	return false;
}

public void showOptions(Hand player, Hand dealer){
	if (someoneWins()){
			System.exit(0);}
	System.out.println("---------------");
	System.out.println("1 for HIT");
	System.out.println("2 for STAY");
	int choice = keyboard.nextInt();
	System.out.println("---------------");
	
	switch (choice) {
	case 1:
		System.out.println("Player adds card:");
		player.addCard(deck);
		showPlayer();
		if(someoneWins()){break;}
		else showOptions(player, dealer);
		
	case 2:
		dealerTurn(player, dealer);
		

	default:
		break;
	}
	
	
}

public void dealerTurn(Hand player, Hand dealer){
	if (dealer.calcCardPoints()<17 && dealer.calcCardPoints()<=23){
		for (int i = 0; i < 17; i++) {
			i = players.get(1).calcCardPoints();
			System.out.println("Dealer adds card:");
			dealer.addCard(deck);
			showDealer();
			System.out.println("---------------");
		}
		
	}
	
	if (players.get(1).calcCardPoints()< players.get(0).calcCardPoints() || players.get(1).calcCardPoints() > 21){
		System.out.println("Player Wins");
		System.exit(0);
	}
	else {
		System.out.println("Dealer Wins");
		System.exit(0);
	}
	
}

public void showPlayer() {
	
	
	players.get(0);
	System.out.println("Player's Hand: " + players.get(0).calcCardPoints());
	players.get(0);

}
public void showDealer() {
	
	System.out.println("Dealer's Hand: " + players.get(1).calcCardPoints());
	players.get(1);
	players.get(0);
	
}

//get + set

public Deck getDeck() {
	return deck;
}

public Player getPlayer() {
	return player;
}

public Player getDealer() {
	return dealer;
}

public List<Hand> getPlayers() {
	return players;
}

public void setDeck(Deck deck) {
	this.deck = deck;
}

public void setPlayer(Player player) {
	this.player = player;
}

public void setDealer(Player dealer) {
	this.dealer = dealer;
}

public void setPlayers(List<Hand> players) {
	this.players = players;
}



}
		
		// shuffleDeck();
		
		// dealHands();
		//Card.printCardInfo();
		// stayOrHit();

		// Deal cards - two to Dealer, two to Player

		// Hand.addCard();
		// Hand.addCard();

// remove cards from deck

// if cards!=21 give player STAY & HIT options

// STAY ends turn, HIT adds a card and removes it from deck

// if player goes over 21, game is over

// once he STAYS, give dealer STAY/HIT options

// if dealer goes over 21, game is over

// STAY ends turn, HIT adds a card and removes it from deck

// compare two hands, winner is closest to 21
