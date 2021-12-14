import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * @author: hansen
 * @date: 2021 - 12 - 13 - 14:47
 */
/*
 *
 *   方法的声明： 权限修饰符 返回值类型 方法名（形参列表）{
 *              }
 *
 *
 *    说明：
 *          1.关于权限修饰符：先默认先都使用public
 *
 *              private,public,缺省,protected
 *
 *
 *          2.返回值类型  ：  有返回值  无返回值
 *
 *          有返回值，必须指定返回值的类型，同时方法中需要使用return
 *
 *
 *          无返回值   用void表示，通常不需要使用return   要是用只能return;  表示结束方法
 *
 *
 *
 *
 *          方法名：  见名知意，符合标识符命名规范
 *
 *
 *          5.方法的使用：   可以调用当前类的属性或者方法
 *                          特殊的：方法a调用方法a   递归方法
 *
 *                     方法中不能定义新的方法
 * */
public class CustomerTest
{
    public static void main(String[] args)
    {
        Customer cust1 = new Customer();
        cust1.eat();
        cust1.sleep(7);
//        int[] arr = new int[]{4, 6, 1, 2, 67, 89, 42};
//        cust1.sort(arr);
    }
}

//客户类
class Customer
{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat()
    {
        System.out.println("客户吃饭");
    }

    public void sleep(int hour)
    {
        System.out.println("休息了" + hour + "个小时");
        eat();
    }

    public String getName()
    {
        return name;
    }

    public String getNation(String nation)
    {
        String info = "我的国籍是：" + nation;
        return info;
    }

    public void sort(int[] arr)
    {

    }
}
