package jp.co.hyokota.tutorial.cucumber.poker;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import spock.lang.*

import org.junit.Test;

import spock.lang.Specification;

public class PokerGameSpec extends Specification {

    PokerGame sut;

    @Unroll
    def "hoge"() {
        when: 
            sut = new PokerGame();
            sut.setUp(Card.get(suit1, no1), Card.get(suit2, no2),
                Card.get(suit3, no3), Card.get(suit4, no4),
                Card.get(suit5, no5));
        then: 
            sut.noChange();

        expect:
            sut.pat() == Pat.NO_PAIR;

        where:
            suit1 | no1 | suit2 | no2 | suit3 | no3 | suit4 | no4 | suit5 | no5 | expected
            'S'   | 1   | 'H'   | 4   | 'D'   | 6   | 'D'   | 8   | 'C'   | 3   | "nopair" 
    }

}
