package br.com.luiztaira.designpatterns.decorator;

public class Eletronic extends MusicDecorator{

    public Eletronic(Music music) {
        super(music);
    }

    public void describe() {
        music.describe();
        System.out.println("Adding eletronic beats...");

    }
}
