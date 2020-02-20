public class Main {
    public static void main(String[] args) {
        MovablePoint ball = new MovablePoint(1,1,2,2);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        ball.move();
        ball.move();
    }
}
