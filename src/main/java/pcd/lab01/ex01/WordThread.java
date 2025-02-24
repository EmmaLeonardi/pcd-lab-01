package pcd.lab01.ex01;

import java.util.Random;

import org.fusesource.jansi.Ansi.Color;

import java.util.Random;

public class WordThread extends Thread{

    private final Screen screen;
    private final String word;
    private final int pos;
	private int y0 = 0;
    private final Random rand;

    public WordThread(Screen screen, String word, int pos){
        this.screen=screen;
        this.word=word;
        this.pos=pos;
        this.rand=new Random();
    }

    public void run(){
        try{
            for(int i=1; i<20; i++){
                screen.writeStringAt(y0+i, pos, Color.RED, word);
                var delay= rand.nextInt(50)+1;
                Thread.sleep(delay+100);
                screen.writeStringAt(y0+i, pos, Color.BLACK, word);
            }
            
        }catch(Exception ex){

        }

	}

}