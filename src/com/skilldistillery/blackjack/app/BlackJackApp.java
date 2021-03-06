package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackDealer;
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
		System.out.println("The dealer is shuffling the deck \n");
		dealer.shuffleDeck();
		System.out.println("Dealer is dealing cards. \n");
		playerOne.getHand().addCard(dealer.dealCards());
		dealer.getHand().addCard(dealer.dealCards());
		playerOne.getHand().addCard(dealer.dealCards());

		dealer.getHand().addCard(dealer.dealCards());
		System.out.println(playerOne.toString() + "\n");
		System.out.println("Dealer shows: " + dealer.getHand().getCard().get(1) + "\n");

		if (playerOne.getHand().isBlackJack()) {
			System.out.println(playerOne.toString() + "\n");
			System.out.println(dealer.toString() + "\n");
			System.out.println("BlackJack!!!! Player wins");
		} else if (dealer.getHand().isBlackJack()) {
			System.out.println(dealer.toString());
			System.out.println("Dealer has blackjack, dealer wins.");
		} else {
			System.out.println("Would you like to hit or stand? \n");

			// loops through game until someone wins 
			while (playerOne.getHand().getHandValue() < 22) {

				String choice = kb.next();

				if (choice.equalsIgnoreCase("Hit")) {
					playerOne.getHand().addCard(dealer.dealCards());
					System.out.println(playerOne.toString() + "\n");
					System.out.println("Dealer shows: " + dealer.toString() + "\n");
					System.out.println("Would you like to hit again or stand? \n");

					if (playerOne.getHand().isBust()) {
						System.out.println(playerOne.toString());
						System.out.println("You busted, dealer wins!");
						break;
					}

				} else if (choice.equalsIgnoreCase("stand")) {

					while (dealer.getHand().getHandValue() < 21) {

						if (dealer.getHand().getHandValue() > 17) {
							System.out.println("Dealer Stands");
							System.out.println(dealer.toString());
							System.out.println(playerOne.toString());
							break;
						}
						if (dealer.getHand().getHandValue() < 17) {
							dealer.getHand().addCard(dealer.dealCards());
							System.out.println(dealer.toString());
							break;
						}
						if (dealer.getHand().isBust()) {
							System.out.println("Dealer busts, you win!");
							System.out.println(dealer.toString());
							System.exit(0);
						}
						if (dealer.getHand().getHandValue() == playerOne.getHand().getHandValue()) {
							System.out.println("\n Push (tie) ");
							break;
						}
					}
				}
				if (dealer.getHand().getHandValue() < playerOne.getHand().getHandValue()) {
					System.out.println("Dealer shows: " + dealer.toString());
					System.out.println(playerOne.toString() + "\n");
					System.out.println("Dealer Wins....you lose");
					break;
				}

				if (dealer.getHand().getHandValue() > playerOne.getHand().getHandValue()) {
					System.out.println(dealer.toString() + "\n");
					System.out.println(playerOne.toString() + "\n");
					System.out.println("You win! ");
					break;
				}
			}
		}
		kb.close();
	}
}
