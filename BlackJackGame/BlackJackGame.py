#/usr/bin/python
# -*- coding: utf-8 -*-
#Jorge Galvis

import random

# Feel free to use these symbols to represent the different suits.
#suits = ['♠', '♣', '♦', '♥']


#Card class is good
class Card(object):

  def __init__(self, suit, rank):
    self.suit = suit
    self.rank = rank
    #pass  # replace this

  def __str__(self):
    return f"{self.suit}{self.rank}"  # replace this line


class CardCollection(object):

  def __init__(self):
    self.cards = []

  def add_card(self, card):
    #pass  # replace this line
    self.cards.append(card)
    return self.cards

  def draw_card(self):
    return self.cards.pop(0)
    # replace this, must remove and return a Card instance from
    # self.cards

  def make_deck(self):
    #pass  # replace this, initialize self.cards with a fresh list of
    # the 52 playing cards in random order.
    #suits and ranks for the deck
    suits = ['♠', '♣', '♦', '♥']
    ranks = ['A', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K']

    #create 52 cards and add it to the deck
    for i in range(len(suits)):
      for j in range(len(ranks)):
        new_card = Card(suits[i], ranks[j])
        self.cards.append(new_card)

    #shuffle the deck
    random.shuffle(self.cards)
    return self.cards

  def value(self):

    points = 0
    values = set()
    for card in self.cards:
      rank = card.rank
      #print(rank)

      if card.rank == '2':
        points += 2
      elif card.rank == '3':
        points += 3
      elif card.rank == '4':
        points += 4
      elif card.rank == '5':
        points += 5
      elif card.rank == '6':
        points += 6
      elif card.rank == '7':
        points += 7
      elif card.rank == '8':
        points += 8
      elif card.rank == '9':
        points += 9
      elif card.rank == '10':
        points += 10
      elif card.rank == 'J':
        points += 10
      elif card.rank == 'Q':
        points += 10
      elif card.rank == 'K':
        points += 10

    for card in self.cards:
      rank = card.rank
      if rank == 'A':
        if card.rank not in values:
          values.add(card.rank)
          if points + 11 > 21:
            points += 1
          else:
            points += 11
        else:
          points += 1

    return points  # replace this, must return an int representing the total
    # value of cards in this collection


def main():

  deck = CardCollection()
  deck.make_deck()  # initialize a fresh deck
  dealt_card = deck.draw_card()

  player_hand = CardCollection()
  player_hand.add_card(dealt_card)

  dealer_hand = CardCollection()

  print("This is Blackjack")
  print("Let's start\n")
  print(f"You drew {dealt_card}")
  print(f"sum: {player_hand.value()}")

  flag = True
  while (flag):
    play_again = input("Do you want another card? (y/n): ")

    if play_again == 'y':
      dealt_card = deck.draw_card()
      player_hand.add_card(dealt_card)
      print(f"You drew {dealt_card}")
      print(f"sum: {player_hand.value()}")

      if player_hand.value() == 21:
        print("You win")
        flag = False
      elif player_hand.value() > 21:
        print("You lost")
        flag = False

    else:
      print("")
      while (dealer_hand.value() < 17):
        dealt_card = deck.draw_card()
        dealer_hand.add_card(dealt_card)
        print(f"I drew {dealt_card}")
        print(f"My sum: {dealer_hand.value()}")

      if dealer_hand.value() == 21:
        print("I win")
        flag = False
      elif dealer_hand.value() > 21:
        print("You win")
        flag = False
      elif dealer_hand.value() == player_hand.value():
        print("The game is push. No body wins.")
        flag = False
      elif dealer_hand.value() > player_hand.value():
        print("I win.")
        flag = False
      elif player_hand.value() > dealer_hand.value():
        print("You win.")
        flag = False


if __name__ == "__main__":
  main()
