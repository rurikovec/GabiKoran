package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.numberOfStrings = 4;
    }


    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum");
    }
}