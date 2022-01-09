import com.xtl.base.Circle;
import com.xtl.base.Shape;
import com.xtl.base.Square;

public class TestInterface {
    public static void main(String[] args) {
        Shape circle=new Circle(2d);
        System.out.println("圆的周长是："+circle.perimeter()+"\t面积是："+circle.area());
        Shape square=new Square(4d);
        System.out.println("正方形的周长是："+square.perimeter()+"\t面积是："+square.area());
    }
}
