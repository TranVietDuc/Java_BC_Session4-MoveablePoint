public class MoveablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(){
    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super.setX(x);
        super.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public  float[]  getSpeed(){
        float[] Speed = new float[2];
        Speed[0] = getxSpeed();
        Speed[1] = getySpeed();
        return Speed;
    }

    @Override
    public  String toString(){
        return super.toString()+
                " ,speed=(" + xSpeed +","+ ySpeed + ")";
    }

    public MoveablePoint move(){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+ySpeed);
        return this;
    }
}
