package edu.jsu.mcis;

import java.util.*;

public class Hangman {
    public enum Result { WIN, LOSE, NONE };
    private String word;
    private List<Character> usedLetters;
	private int numGuesses;
    
    public Hangman() {
        word = "";
        usedLetters = new ArrayList<Character>();
		numGuesses = 0;
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public boolean available(char c) {
		int count = 0;
		while(count < usedLetters.size())
		{
			if(usedLetters.get(count) == c)
			{
				return false;
			}
		}
		return true;
    }
    
    public int guess(char c) {
		
        return numGuesses;
    }
    
    public Result getResult() {
        return Result.NONE;
    }
    
}












