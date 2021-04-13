package ie.yyyura.springfw;

public class Player {

    private MusicInterface mi;

    // L6b - vnedrit prostoe znachenije
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // lesson 5 - IoC - dependency injection using Constructor
    public Player(MusicInterface mi) {
        this.mi = mi;
    }

    // pustoj konstruktor, esli be mi ne sozdali svoj - to Java bi sozdala ego za nas
    public Player() {
    }

    // lesson 6 - DI using Setter
    // Spring udaljaet "set" "MusicSetter" delaet s malenkoj i v .xml ispolzuem "musicSetter"->
    public void setMusicSetter(MusicInterface miIN) {
        this.mi = miIN;
    }

    public void play() {
        System.out.println("Playing " + mi.getSong());
    }
}
