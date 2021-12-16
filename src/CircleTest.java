import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @author: hansen
 * @date: 2021 - 12 - 16 - 17:13
 */
/*
* 计算圆的面积
* */
public class CircleTest
{
    public static void main(String[] args){
        Circle c1=new Circle();
        c1.radius=2.1;
        System.out.println(c1.findArea());
    }
}
class Circle{
    double radius;
    //方法
    public double findArea(){
        double area=Math.PI*radius*radius;
        return area;
    }
}
