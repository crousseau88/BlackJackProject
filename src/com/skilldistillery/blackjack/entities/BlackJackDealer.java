package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;



public class BlackJackDealer extends Player {

	private Deck deck = new Deck();
	
	public Deck getDeck() {

		return deck;
	}
	public void shuffleDeck() {
		deck.shuffleDeck();
	}
	
//	public void showCard() {
//		System.out.println("Dealer has: " + card );
//	}
	
	@Override
	public String toString() {
		return "BlackJackDealer: " + getHand() + "";
	}
	public Card dealCards() {
		return deck.dealCard();
				
	}

//	public void dealerHit() {
//		//if hand is less than 17, deal card
//		
//		
//	
//	}
//	
//	public void dealerStand() {
//		//if hand is over 17 stay
//	}
//	
	
	
}
