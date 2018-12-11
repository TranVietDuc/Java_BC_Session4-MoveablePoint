public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] setXY(){
        float[] arrayXY = new float[2];
        arrayXY[0] = x;
        arrayXY[1] = y;
        return arrayXY;
    }

    public String toString(){
        return "(" + x + "," +y+ ")";
    }
}
