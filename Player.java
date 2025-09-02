import java.util.ArrayList;

public class Player {
    private Hand hand;
    private int score;
    private String name;
    private boolean hasChopsticks;
    private boolean hasPlayedCard;
    private Card selectedCard;
    private int playerIndex;

    public Player(String name, int playerIndex) {
        this.name = name;
        this.playerIndex = playerIndex;
        this.hand = new Hand();
        this.score = 0;
        this.hasChopsticks = false;
        this.hasPlayedCard = false;
        this.selectedCard = null;
    }
    public void playCard() {
        if (hand.contains(selectedCard)) {
            int index = hand.indexOf(selectedCard);
            hand.remove(index); 
            selectedCard = null;
            hasPlayedCard = true;
        } else {
            throw new IllegalArgumentException("Card not in hand");
        }
    }

}