/**
 * @author: hansen
 * @date: 2021 - 12 - 12 - 14:41
 */
/*
 * 1.类中属性的使用
 *
 *  直接定义在类的一对{}里面的变量，下面这三个就是属性(成员变量)
 *  声明在方法内，方法形参，代码快内，构造器形参，构造器内部的变量 称为  局部变量。
 *
 *
 *  2.权限修饰符
 *  属性：在声明属性时，可以指明其权限，使用权限修饰符
 *  常用权限修饰符：private,static,缺省,protected
 *
 *   局部变量不准使用权限修饰符
 *
 *
 *
 *  3.默认初始化值
 *  属性：类的属性根据其类型有默认初始化值
 *          整型(byte,int,short,long):0
 *          浮点型(float,double):0.0
 *          字符型(char):0
 *          布尔型(boolean):false
 *          引用数据类型(类，数组。。。）：null
 *
 *
 *   局部变量： 没有默认初始化值
 *
 *
 *
 *  4.在内存中加载的位置
 *      属性：在堆空间加载
 *      局部变量：在栈空间加载
 * */
public class Test2
{
    public static void main(String[] args)
    {
        User u1=new User();
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u1.isMale);
        u1.talk("日语");
    }
}

class User
{
    //直接定义在类的一对{}里面的变量，下面这三个就是属性(成员变量)
    String name;
    int age;
    boolean isMale;

    public void talk(String language)//此时的language(形参)就是局部变量
    {
        System.out.println("我们使用" + language + "交流");
    }

    public void eat()
    {
        String food="fish";//在方法里面定义的变量也是局部变量
        System.out.println(food);
    }
}
