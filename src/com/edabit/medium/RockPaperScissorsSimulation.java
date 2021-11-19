package com.edabit.medium;
/*
 * Create a function which simulates the game "rock, paper, scissors". The function takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player. The function returns the result as such:

    "Player 1 wins"
    "Player 2 wins"
    "TIE" (if both inputs are the same)

The rules of rock, paper, scissors, if not known:

    Both players have to say either "rock", "paper" or "scissors" at the same time.
    Rock beats scissors, paper beats rock, scissors beat paper.
 */
public class RockPaperScissorsSimulation {

public static String rps(String s1, String s2) {
	//scenarios where player 1 wins:
	if ((s1 == "rock" && s2 == "scissors") || (s1 == "paper" && s2 == "rock") || (s1=="scissors" && s2=="paper")) {
		return "Player 1 wins";
	} else if ((s1=="rock"&& s2=="paper")||(s1=="paper" && s2=="scissors")||(s1=="scissors" && s1=="rock")) {
		return "Player 2 wins";
	} else {
		return "TIE";
	}
	}

	public static void main(String[] args) {
		String string = "string";
		System.out.println("string"==string);
	}
}
