package br.com.luiztaira.designpatterns.decorator;

public class Rock extends MusicDecorator {

    public Rock(Music music) {
        super(music);
    }

    public void describe() {
        music.describe();
        System.out.println("Adding guittar, bass and drums...");
    }
}
