//카드 저장 클래스

import java.util.ArrayList;
import java.util.Collections;

public class Card {
	String suit;
	String number;
	public Card(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}
	//Card객체에 저장된 데이터를 표현하기 위해 toString 메소드를 활용
	@Override
	public String toString() {
		return "(" + suit + " " + number + ")";
	}
}
    


//카드를 획득하는 플레이어 클래스
 class Player {
	ArrayList<Card> card = new ArrayList<Card>();
    //Card 타입 ArrayList 객체 생성
	
	public void getCard(Card card) {
		this.card.add(card);
	}
	public void showCards() {
		System.out.println(card);
	}
}
   


//카드를 랜덤으로 섞어주는 클래스
 class Deck {
	//Card 타입의 ArrayList 객체를 생성하고 배열에 카드모양와 숫자생성
	ArrayList<Card> deck = new ArrayList<Card>();
	String[] suit = {"CLUB", "DIAMOND", "HEART", "SPACE"};
	String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	
	public Deck() { //전체카드(경우의 수) 전체 deck ArrayList에 저장
		for(int i = 0; i < suit.length; i++){
			for(int j = 0; j < number.length; j++)
				deck.add(new Card(suit[i],number[j]));
		}
	}
    
	public void shuffle() {
		//Collections.shuffler : 저장된 데이터들을 랜덤으로 출력한다.
		//deck ArrayList에 저장된 데이터들 중에서 랜덤으로 출력
		Collections.shuffle(deck);
	}
    
	public Card deal() { 
		return deck.remove(0);
	} //카드게임에서 카드 한 장 나눠줄 때를 구현
	//remove() : 리스트에서 해당 인덱스의 값을 제거하고, 그 값을 반환
	//즉, deal() 메소드는 deck()메소드에서 52개의 Card객체를
	//만들어 준 것중에 첫번째 요소를 제거하고 그 제거한 요소를 반환한다			
}
   

 class CardGame {
	public static void main(String[] args) {
		//Deck 객체를 생성하고
		//Deck 기본 생성자를 실행하면, for문을 활용해 카드 정보들이 저장됨
		Deck deck = new Deck();
		//객체를 활용해 shuffle 메소드를 실행함, 랜덤으로 저장된 값 중 하나를 획득함
		deck.shuffle();
		//카드를 획득하는 Player 객체 생성
		Player p1 = new Player();
		Player p2 = new Player();
		//getCard 메소드를 실행해 덱에서 카드 정보를 ArrayList 객체에 저장함
		//deal 메소드로 52개의 Card객체 중 하나를 가져와서 Player 클래스의 getCard 메소드로 보낸다.
		//그럼 Player 클래스는 이 받아온 Card 객체를 멤버 변수에 담아놨다가
		//ShowCards 메소드 호출로 출력
		p1.getCard(deck.deal());
		p2.getCard(deck.deal());
		//저장된 데이터를 출력함
		p1.showCards();
		p2.showCards();
	}
}
