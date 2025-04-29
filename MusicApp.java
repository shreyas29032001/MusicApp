interface Playable {
    void play();

}

abstract class Instrument implements Playable {
    public void tune() {
        System.out.println("Instrument is being tuned");
    }

    abstract void repair();

}

final class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing music.");
    }

    @Override
    void repair() {
        System.out.println("Repairing the Guitar.");
    }

}

public class MusicApp {
    public static void main(String[] args) {
        Guitar myguitar = new Guitar();
        myguitar.tune();
        myguitar.play();
        myguitar.repair();

    }

}
