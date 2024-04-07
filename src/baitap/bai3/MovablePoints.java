package baitap.bai3;
/*ngoại lệ là 1 sự kiện xảy ra trong quá trình thực thi(run),
nó làm phá vỡ luồng xử lí bình thường của 1 chương trình(làm chương trình thiệt hại)
-Ngoại lệ xảy ra với nhiều lí do khác nhau(lỗi người dùng, Dev)
-thông thường chúng ta có thể chia làm 2 loại: -checked Exceptions(xảy ra trong quá trình biên dịch
                                               -Unchecked Exceptions(xảy ra trong quá trình Runntime)

-Error : đây là vấn đề quan trọng liên quan đến hệ thống mà ta không thể kiểm soát được
 */
public class MovablePoints implements Movable {
        private int x;
        private int y;
        private int ySpeed;
        private int xSpeel;

    public MovablePoints(int x, int y, int ySpeed, int xSpeel) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeel = xSpeel;
    }

    public String toString(){
        return x + y + ySpeed + xSpeel+ "";
    }


    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLetf() {
        x -= xSpeel;
    }

    @Override
    public void moveRight() {
        x += xSpeel;
    }

}
