package qa.guru;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot("BostonDynamics", "Destroyer", "Android 4.1", 80.25f, 1.300f, 8, 10, 6);
        robot.displayInfo();
        robot.move();
        robot.jump();

        robot.setBroken(true);
        robot.move();
        robot.jump();

    }

}
