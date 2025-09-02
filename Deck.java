import java.util.ArrayList;
import java.util.Collections;
public class Deck {
    private ArrayList<Card> cards;
    private int numCards;
    private int maxCards = 108;
    private String[] cardTypes = {"dumpling", "sashimi", "tempura", "maki1", "maki2", "maki3", "wasabi", "chopsticks", "pudding"};
    public Deck() {
        for(int i = 0;i<maxCards;i++){
            int rand = (int)(Math.random()*cardTypes.length);
            cards.add(new Card(cardTypes[rand]));
            
        }
        Collections.shuffle(cards);


    }
    public void remove(int index) {
        cards.remove(index);
    }
    public Card get(int index) {
        return cards.get(index);
    }
   
   


}
