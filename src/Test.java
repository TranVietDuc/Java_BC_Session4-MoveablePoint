public class Test {
    public static void main(String[] args) {
        Point2D myPoint2D = new Point2D();
        System.out.println(myPoint2D);

        myPoint2D = new Point2D(2.0f,3.0f);
        System.out.println(myPoint2D);

        MoveablePoint myMoveablePoint = new MoveablePoint();
        System.out.println(myMoveablePoint);

        myMoveablePoint = new MoveablePoint( 2.0f,3.0f);
        myMoveablePoint.move();
        System.out.println(myMoveablePoint);

        myMoveablePoint = new MoveablePoint( 3.0f, 2.0f,2.0f,3.0f);
        myMoveablePoint.move();
        System.out.println(myMoveablePoint);

    }
}
