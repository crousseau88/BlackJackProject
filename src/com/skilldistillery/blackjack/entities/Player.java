package com.skilldistillery.blackjack.entities;

public class Player {
//get cards hit stay methods
	
	private BlackJackHand blackJackHand = new BlackJackHand();
	
	
	


	@Override
	public String toString() {
		return "Player [hand=" + blackJackHand + "]";
	}





	public BlackJackHand getHand() {
		return blackJackHand;
	}





	public void setHand(BlackJackHand hand) {
		this.blackJackHand = hand;
	}





	public void hit(Card card) {
		blackJackHand.addCard(card);
	}
}
