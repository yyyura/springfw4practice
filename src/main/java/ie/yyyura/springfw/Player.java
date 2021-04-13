package ie.yyyura.springfw;

public class Player {

    private MusicInterface mi;

    //IoC - Constructor
    public Player(MusicInterface mi) {
        this.mi = mi;
    }

    public void play() {
        System.out.println("Playing " + mi.getSong());
    }
}
