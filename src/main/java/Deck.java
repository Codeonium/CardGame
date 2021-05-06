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

    }


//    public void loadDeck1() {
//        cards = new ArrayList<Card>();
//
//        for(int i = 0; i < RankType.length; i++) {
//            for(int j =0; j < SuitType.length; j++)
//            {
//            cards.add(new Card(RankType[i], SuitType[j]));
//            }
//        }
//    }

    public void fill() {
        for (SuitType suitType : SuitType.values()) {
            for (RankType rankType : RankType.values()) {
                Card cards = new Card(suitType, rankType);
                this.cards.add(cards);
            }
        }
    }

    // populateDeck() -> void
    // Enums - for suites and for ranks
    // loop through all suites
    // loop through all ranks
    // create a card object with the currently iterated
    // suite and rank
    //add said card to this.cards

}
