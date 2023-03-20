import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Card {

	public static int SPADE = 0;
	public static int HEART = 1;
	public static int DIAMOND = 2;
	public static int CLUB = 3;

char[] SuitChar = {'S', 'H', 'D', 'C'};

	//Fields
	private int suit;
	private int rank;

	//Constructor
	public Card(int s, int r){
		this.suit = s;
		this.rank = r;
	}

	//Methods

	public String toString() {
		String name;
		String rankwFace;
		if(suit == SPADE){
			name = "Spade";
		}else if(suit == HEART){
			name = "Heart";
		}else if(suit == DIAMOND){
			name = "Diamond";
		}else if(suit == CLUB){
			name = "Club";
		} else{
			name = "Error";
		}
		
		if(rank == 1){
			rankwFace = "Ace";
		}else if(rank == 11){
			rankwFace = "Jack";
		}else if(rank == 12){
			rankwFace = "Queen";
		}else if(rank == 13){
			rankwFace = "King";
		}else{
			rankwFace = String.valueOf(rank);
		}

		return(rankwFace + " of " + name + "s"); 
	}
	public int getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
	public boolean isFaceCard(){
		if(this.rank > 10) return true;
		else return false;
	}

	public boolean isRed() {
		if(this.suit == Card.HEART || suit == DIAMOND) {
			return true;
		}else return false;
	}
	public boolean isBLack() { return !isRed();}
}


//ArrayList -> Data Structures / Data Abstraction
//
//The idea of a list is it is an array that can change size
//arraylists are parametric, meaning they have to specify what kind of thing they contain.

//ArrayList<String> words = new ArrayList<String>();
//^^^ this is the syntax for making an ArrayList
//
//lots of fun methods~
//.add(E), .add(int, E), lists can have multiple types in one list!
//.get(int) .set(int) .remove(int)
//.size() .contains(E) etc....
//
//


class Deck {
	//Fields
	private ArrayList<Card> cards;

	//Constructor
	public Deck() { //could want it to have all 52 cards, or an empty deck
			//null reference type is when initialized without anything in it
		cards = new ArrayList<Card>(); 

	}

	public static Deck emptyDeck() {
		return new Deck();
	}

	public static Deck standardDeck() {
		Deck d = new Deck();
		int[] suits = {Card.SPADE, Card.HEART, Card.DIAMOND, Card.CLUB};
		for(int r=1; r<=13; r++){ //rank
			for(int s=0; s<=3; s++){
				d.add(new Card(suits[s], r));
				//System.out.println(new Card(suits[s], r));
			}
		}
		return d;
		
	
	
	}


	//Methods
	public Card deal() {
		return cards.remove(0); //.remove returns the removed value
	}

	public void add(Card a) {
		cards.add(a);
	}

	public int size() {
		return cards.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;

	}

	public String toString(){
		return this.cards.toString();
	}

	public Card getCard(int i){
		return cards.get(i);
	}
	
	public void shuffle(){


		/*Random rand = new Random();
		ArrayList<Card> tmp = new ArrayList<Card>();

		while(this.cards.size() > 0){
			int randomIndex = rand.nextInt(this.cards.size());
			tmp.add(this.cards.remove(randomIndex));
		}
		this.cards = tmp;*/

		Collections.shuffle(cards); //built in method for ArrayList :D

	}
	}



class DeckTester{
	public static void main(String[] args) {
		Deck d = Deck.standardDeck();
		System.out.println(d);
		d.shuffle();
		System.out.println(d.toString());
		//Deck k = new standardDeck; bruh bruh bruh bruh
	}

}

class CardTester {
	public static void main(String[] args){
		Card c = new Card(1, 5);
		System.out.println(c);
		//System.out.println(c.getSuit);
	}
}
