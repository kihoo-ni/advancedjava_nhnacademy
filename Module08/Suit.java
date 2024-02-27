import javax.swing.ScrollPaneConstants;

public enum Suit{
    Space("Black"),
    Diamond("Red"),
    Heart("Red"),
    Club("black");

    private String color;
    
    private Suit(){

    }
    private Suit(String color){
        this.color=color;
    }
    public String getColor(){
       return this.color;
    }
}

class Card{
    private int number;
}

class HwaToo extends Card{

}

class PokerCard extends Card {
    private int number;
    private String displayNumber;
    private Suit shape;
    

    public Card(int number, Suit shape){
        this.number=number;
        this.shape=shape;
        this.displayNumber=getDisplayNumber(number);
    }

    private String getDisplayNumber(int number){
        return null;
    }

    public String getColor(){
        return this.shape.getColor();
    }



}

class Board{
    public static void main(String[] args) {
        Card card=new Card(1, Suit.Space);
        System.out.println(card.getColor());
    }
}