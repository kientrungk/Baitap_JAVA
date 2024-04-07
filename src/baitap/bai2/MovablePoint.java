package baitap.bai2;

public class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
            x++;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLetf() {
        x--;
    }

    @Override
    public void moveRight() {
        y++;
    }

    public void PrintPoits(){
        System.out.println("diem hien tai la : " + "x = " + x + "\ny = " + y );
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2, 4);
        movablePoint.moveDown();
        movablePoint.PrintPoits();
    }
}

