/**
 * @author: hansen
 * @date: 2021 - 12 - 11 - 19:07
 */
public class Test1
{
    public static void main(String[] args)
    {
        //创建Person类的实例化对象
        Person p1 = new Person();
        //调用对象的结构：属性，方法
        p1.name = "tom";
        p1.isMale = true;
        System.out.println(p1.name);
        p1.talk("English");

        //************************************
        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.isMale);

        //************************************
        Person p3=p1;
        System.out.println(p3.name);
        p3.age=10;
        System.out.println(p1.age);

    }
}

class Person
{
    //属性
    String name;
    int age = 1;
    boolean isMale;

    //(行为)方法
    public void eat()
    {
        System.out.println("人可以吃饭");
    }

    public void walk()
    {
        System.out.println("人可以走路");
    }

    public void talk(String language)
    {
        System.out.println("人可以讲话,说的是" + language);
    }
}