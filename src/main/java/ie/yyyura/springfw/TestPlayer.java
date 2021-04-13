package ie.yyyura.springfw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPlayer {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // lesson 4
        // from Spring Context we get "some" object(Bean) which implements MusicInterface (could be Classical or Rock)
        // Not needed -- MusicInterface mi = context.getBean("musicBean", MusicInterface.class);
        // lesson 4 - dependency injection manually
        // we got Bean from Spring context mi, and injected in Player
        // Not needed -- Player player = new Player(mi);

        // lesson 5, 6
        Player player = context.getBean("playerBean", Player.class);

        player.play();

        System.out.println(player.getName());
        System.out.println(player.getVolume());

        context.close();
    }
}
