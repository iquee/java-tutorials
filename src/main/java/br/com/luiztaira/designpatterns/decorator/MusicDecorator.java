package br.com.luiztaira.designpatterns.decorator;

public abstract class MusicDecorator implements Music {
    protected Music music;

    public MusicDecorator(Music music) {
        this.music = music;
    }
}
