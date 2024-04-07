package baitap.bai3;

public class MovableCircle extends MovablePoints  implements Movable {
    private int rarius;
    private MovablePoints center;


    public MovableCircle(int x, int y, int ySpeed, int xSpeel, int rarius){
        super(x, y, ySpeed, xSpeel);
        this.rarius = rarius;
    }

    public String toString(){
        return "Center: " + center.toString() + ", Radius: " + rarius + ", " + super.toString();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLetf() {
        super.moveLetf();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }
}
