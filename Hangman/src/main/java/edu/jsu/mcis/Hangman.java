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
		for(int i = 0; i < usedLetters.size(); i++)
		{
			if(usedLetters.get(i) == c)
			{
				return false;
			}
		}
		return true;
    }
	
    public int guess(char c) {
		usedLetters.add(c);
		int occurs = 0;
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == c)
			{
				occurs++;
			}
		}
		//checkResult();
        return occurs;
    }
    
/*	public void checkResult()
	{
		int count = 0;
		for (int i = 0; i < usedLetters.size(); i++)
		{
			if(usedLetters.get(i) 
		}	
	}*/
    public Result getResult() {
	
        return Result.LOSE;
    }
    
}












