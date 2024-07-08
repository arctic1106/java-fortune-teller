package demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class FortuneTest {

    @Test
    @DisplayName("Returns a fortune")
    void testItWorks() throws JsonProcessingException {
        Fortune fortune = new Fortune();
        assertFalse(fortune.randomFortune().isEmpty());
    }
}
