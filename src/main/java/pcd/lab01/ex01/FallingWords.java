package pcd.lab01.ex01;

import static pcd.lab01.ex01.AuxLib.*;

import pcd.lab01.ex01.AuxLib.WordPos;


public class FallingWords {
    public static void main(String[] args) {
		
		var sentence = "This is a simple sentence with words ready to fall";
		var wordList = getWordsPos(sentence);
		
        Screen screen = Screen.getInstance();
		screen.clear();
    
        for (WordPos word : wordList) {
            var thread=new WordThread(screen, word.word(), word.pos());
            thread.start();
        }
        
	}
}
