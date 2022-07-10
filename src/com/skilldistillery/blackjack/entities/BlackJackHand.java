package com.skilldistillery.blackjack.entities;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
	}

	@Override
	public int getHandValue() {
		int value = 0;
		for (Card card : this.hand) {
			value += card.getValue();
		}
		return value;
	}

	public boolean isBlackJack() {
		// if hand value equals 21 is blackjack
		if(this.getHandValue() == 21 && this.hand.size() == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean push(Hand playerHand, Hand dealerHand) {
		if(playerHand.getHandValue() == dealerHand.getHandValue()) {
            return true;
        }
        else {
		return false;
        }
	}
	public boolean isBust() {
		// if hand value is over 21
		if(((BlackJackHand) hand).getHandValue() > 21) {
			return true;
		}else {
		return false;
	}
  }
}

// STRETCH GOALS
//	public boolean isHard() {
//		//if hand does not have ace
//	}
//	
//	public boolean isSoft() {
//		//if ace is present
//	}

