package com.skilldistillery.blackjack.entities;

public class Player {
//get cards hit stay methods
	
	private BlackJackHand hand = new BlackJackHand();
	
	
	


	@Override
	public String toString() {
		return "Player [hand=" + hand + "]";
	}





	public BlackJackHand getHand() {
		return hand;
	}





	public void setHand(BlackJackHand hand) {
		this.hand = hand;
	}





	public void hit(Card card) {
		hand.addCard(card);
	}
}
