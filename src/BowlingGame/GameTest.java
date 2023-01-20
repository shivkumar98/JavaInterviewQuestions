package BowlingGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void AllZeros(){
        Game game = new Game();
        rollGame(game, 0,0,0,0,0,0,0,0,0,0);
        assertEquals(0,game.score());
    }

    @Test
    void AllSpares(){
        Game game = new Game();
        rollGame(game,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5);
        assertEquals(game.score(),150);
    }

    static void rollGame(Game game, int... args){
        for (int i=0;i<args.length;i++){
            game.roll(args[i]);
        }
    }
}