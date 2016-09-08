package com.wwh.thj4.typeinfo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Human aPerson = new Human();
//        Class c1 = aPerson.getClass();
//        System.out.println(c1.getName());
//        System.out.println(c1.getPackage());
//
//        Human anotherPerson = new Woman();
//        Class c2 = anotherPerson.getClass();
//        System.out.println(c2.getName());
//
//        Class c3 = Woman.class;
//        System.out.println(c3.getName());
//        Woman woman = (Woman) c3.newInstance();
//        System.out.println(woman);
//
//        Class c4 = Class.forName("com.wwh.thj4.typeinfo.Human");
//        System.out.println(c4.getName());
//
//         Class ct = Class.forName("com.wwh.thj4.typeinfo.Human");
//         System.out.println(ct.getName());
//        //获取声明的变量
//         Field[]fields = ct.getDeclaredFields();
//        //获取方法名，通过反射
//        Method[] methods=ct.getDeclaredMethods();
//        for (Field field : fields) {
//            System.out.println(field.getName()+" "+field.getType());
//        }
//        for (Method method:methods){
//            System.out.println(method.getReturnType()+""+method.getName()+" ");
//        }


//        System.out.println(ct2.getName());
//        Method[] methods=ct2.getDeclaredMethods();
//        for (Method method:methods){
//            System.out.println(method.getReturnType()+""+method.getName()+" ");
//        }

        //获取方法名，通过反射
        Class ct2 = Class.forName("com.wwh.thj4.typeinfo.Woman");
        //调用private方法
        Method g=ct2.getDeclaredMethod("walk");
        g.setAccessible(true);
        g.invoke(ct2.newInstance());

        //调用公有方法
        Method m=ct2.getDeclaredMethod("setAge",int.class);
        m.invoke(ct2.newInstance(),12);

        Method m2 = ct2.getDeclaredMethod("hi",new Class[]{int.class,String.class});
        m2.invoke(ct2.newInstance(),20,"chb");

        Method staticMethod = ct2.getDeclaredMethod("hi",int.class,String.class);
        staticMethod.invoke(ct2,25,"test");
    }
}
class Human {
    public int getHeight() {
        return this.height;
    }
    public void growHeight(int h) {
        this.height = this.height + h;
    }
    private int height;
}

class Woman extends Human {
    public Human giveBirth() {
        System.out.println("Give birth");
        return (new Human());
    }
    public void test(){
        System.out.println("hello woman!");
    }
    public static   void hi(int age,String name){
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁");
    }
    private void walk(){
        System.out.println("I like running！");
    }
    public void setAge(int age){
        System.out.println("My age is :"+age);
    }
}