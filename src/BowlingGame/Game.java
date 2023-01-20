package BowlingGame;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Game {

    private int[] throwsOfFrame = new int[10];
    private int[] frameResult = new int[10];
    private int frame = 1;
    int totalScore =0;
    Map<Integer, Integer> pinScores = new HashMap<>();


    public void roll(int pins){
        System.out.println("frame: "+frame);
        System.out.println("throwsofFrame: "+ Arrays.toString(throwsOfFrame));
        if (frame>=1 && frame<=9){
            if (throwsOfFrame[frame-1]==0){ // no throws made yet
                pinScores.put(frame, pins);
                if (pins<10)
                    pinScores.put(frame-1,pins);
                throwsOfFrame[frame-1]=1;
                if (pins==10) { // STRIKE!!!
                    throwsOfFrame[frame-1]=2;
                    frameResult[frame-1] = 2;
                    frame++; // move to next frame
                }

            } else if (throwsOfFrame[frame-1]==1) { // first throw made already and not strike
                if ((pinScores.get(frame-1)+pins)==10){ // SPARE!!!
                    System.out.println("spared!");
                    frameResult[frame-1] = 1;
                    pinScores.put(frame, 10);
                } else { // NO BONUS!!!
                    frameResult[frame-1] = 0;
                    pinScores.compute(frame-1,(k,v)->v+pins);
                }
                frame++; // move to next frame
            }

        } else if (frame==10){
            // to do: logic
        }
    }

    public int score(){
        System.out.println("final pins: "+pinScores);
        System.out.println("throw results: "+Arrays.toString(frameResult));
        for (int i=0;i< pinScores.size();i++){
            totalScore+= pinScores.get(i);
            if (frameResult[i]==1 ){
                totalScore+= 2*pinScores.get(i+1);
            }
        }
        return totalScore;
    }

    public static void main(String[] args) {
        Game game = new Game();
        for (int i=0;i<21;i++){
            game.roll(5);
        }

        System.out.println(game.score());
    }
}
}
