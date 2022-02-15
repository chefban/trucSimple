import exception.NotValidParameterException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GameOfLifeTest {

    private GameOfLife gameOfLife ;

    @BeforeEach
    void init(){
        gameOfLife = new GameOfLife();
    }

    /*@Test
    void shouldThrowException() {
        Assertions.assertThrows(NotValidParameterException.class, () -> {
            gameOfLife.verifyConstraint(1,-1,5478);
        });
    }*/




}