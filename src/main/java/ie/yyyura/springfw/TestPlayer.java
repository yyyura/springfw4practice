package ie.yyyura.springfw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPlayer {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // lesson 7:
        Player player1 = context.getBean("playerBean", Player.class);
        Player player2 = context.getBean("playerBean", Player.class);

        boolean isPointingToTheSameObject = player1 == player2;
        System.out.println("Pointing To The Same Object " + isPointingToTheSameObject);

//        player1.play();
//
//        System.out.println(player1.getName());
//        System.out.println(player1.getVolume());

        context.close();
    }
}
