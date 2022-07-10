package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackDealer;
import com.skilldistillery.blackjack.entities.BlackJackHand;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {

	public static void main(String[] args) {
		Deck deck = new Deck();
		BlackJackApp app = new BlackJackApp();
		app.play();
	}

	public void play() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Let's play some blackjack!\n");
		BlackJackDealer dealer = new BlackJackDealer();
		Player playerOne = new Player();
		
		dealer.shuffleDeck();
		dealer.dealCards();

		playerOne.getHand().addCard(dealer.dealCards());
		dealer.getHand().addCard(dealer.dealCards());
		playerOne.getHand().addCard(dealer.dealCards());
		dealer.getHand().addCard(dealer.dealCards());

		
		
		boolean playHand = true;
		do {
			
			System.out.println(playerOne.toString() +"\n");
			System.out.println("Dealer shows: " + dealer.getHand().getCard().get(0)+"\n");
			
			
			
			
			
			
			
			
		} while(playHand);
		
		
	}
}
