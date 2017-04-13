package br.com.luiztaira.designpatterns.bridge;

public class DemoBridge {

    public static void main(String[] args) {
        Maps maps = new GoogleMaps();
        try {
            System.out.println(maps.getMaps("http://maps.google.com?q=wall-street"));
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
