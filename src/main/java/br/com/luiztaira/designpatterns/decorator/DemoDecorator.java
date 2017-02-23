package br.com.luiztaira.designpatterns.decorator;

public class DemoDecorator {

    public static void main(String[] args) {
        Music music = new BasicMusic();
        music = new Rock(music);
        music.describe();

        System.out.println("-----");

        Music music1 = new BasicMusic();
        music1 = new Eletronic(music1);
        music1.describe();
    }
}
