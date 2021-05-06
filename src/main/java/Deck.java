import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int getDeckSize(){
        return this.cards.size();
    }

    public void populateDeck() {
        for (SuitType suitType : SuitType.values()) {
            for (RankType rankType : RankType.values()) {
                Card cards = new Card(suitType, rankType);
                this.cards.add(cards);
            }
        }
    }
}
