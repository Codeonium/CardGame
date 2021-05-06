import javax.smartcardio.Card;
import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
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
        int i = 0;
        for (SuitType s : SuitType.values()) {
            for (RankType r : RankType.values()) {
                Card cards[] = new ArrayList<Card>(r,s);
                i++;
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
