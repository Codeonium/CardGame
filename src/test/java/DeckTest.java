import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void DeckStartsEmpty() {
        assertEquals(0, deck.getDeckSize());
    }



    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52,deck.getDeckSize());
    }

    @Test
    public void canPopulateDeck2() {
        deck.fill();
        assertEquals(52,deck.getDeckSize());
    }

}


//EachCardOnlyHasOneRankAndOneSuit
// CardsDoNotRepeatThemselves
//DeckHasXCards