package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();
	

	public Deck() {
		
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
			}
		}
	
	}
	public int checkDeckSize() {
		return deck.size();
	}
	public void shuffleDeck() {
		Collections.shuffle(deck);
		
	}
	public Card dealCard() {
		return deck.remove(0);
	}
}
