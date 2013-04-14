package jp.co.hyokota.tutorial.cucumber.poker;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import cucumber.annotation.ja.ならば;
import cucumber.annotation.ja.もし;
import cucumber.annotation.ja.前提;

public class PokerGameStepDefs {

//    @前提("^手札にS(\\d+),H(\\d+),D(\\d+).D(\\d+),C(\\d+)が配られた$")
//    public void 手札にS_H_D_D_C_が配られた(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
//        // Express the Regexp above with the code you wish you had
//        throw new PendingException();
//    }
    PokerGame sut;

    @前提("^手札に([SHDC])(\\d+),([SHDC])(\\d+),([SHDC])(\\d+),([SHDC])(\\d+),([SHDC])(\\d+)が配られた$")
    public void 手札にカードが配られた(char suit1, int no1, char suit2, int no2,
            char suit3, int no3, char suit4, int no4, char suit5, int no5)
            throws Throwable {
        sut = new PokerGame();
        sut.setUp(
            Card.get(suit1, no1),
            Card.get(suit2, no2),
            Card.get(suit3, no3),
            Card.get(suit4, no4),
            Card.get(suit5, no5));
    }

    @もし("^チェンジしない$")
    public void チェンジしない() throws Throwable {
        sut.noChange();
    }

    @ならば("^ノーペアであるべき$")
    public void ノーペアであるべき() throws Throwable {
        Pat result = sut.pat();
        assertThat(result, is(Pat.NO_PAIR));
    }

}
