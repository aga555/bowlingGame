package bowling.demo;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingGameSpec {
    BowlingGame bowlingGame = new BowlingGame();

    @Test
    void shouldScoreOneWhenRolledOneWithJUnit() {
        assertEquals(1, bowlingGame.getScore());
    }

    @Test
    void shouldScoreWhenRolledOneWithAssertJ() {
        assertThat(bowlingGame.getScore());
    }
}
