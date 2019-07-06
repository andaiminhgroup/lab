package com.imooc.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        // 三种取得类类型的办法：
        Class k1 = Kitty.class;
        Class k2 = new Kitty().getClass();
        Class k3 = null;
        try {
            k3 = Class.forName("com.imooc.reflection.Kitty");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        // 一个 Class 类有且只有一个实例对象（也叫类类型 class type）：
        System.out.println(k1 == k2);
        System.out.println(k2 == k3);

        // 通过类类型创建对象实例（需要无参数的构造方法）
        Life life;
        try{
            // 运行时加载类，为动态加载
            // 编译时加载类，为静态加载
            // 此处 k3 编译时无需加载相关类，是为动态加载。
            life = (Life) k3.newInstance();
            life.grow();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(k1.getName()); //com.imooc.reflection.Kitty
        System.out.println(k1.getSimpleName()); //Kitty

        /**
         *
         * getMethods()
         *      所有的 public 的 method，包含父类的方法。
         *
         * getDeclaredMethods()
         *      所有的自己声明的 method，包含 private 的方法。
         *
         */
        Method[] methods = k1.getDeclaredMethods();
        for (int i=0; i<methods.length; i++){
            Class[] types = methods[i].getParameterTypes();

            String parameters = "";
            for (int j=0; j<types.length; j++){
                parameters += types[i].getName() + ";";
            }

            System.out.println("DeclaredMethod: " + methods[i].getName() +
                    ", ReturnType:" + methods[i].getReturnType().getSimpleName() + ", Parameters: " + parameters);
        }
        methods = k1.getMethods();
        for (int i=0; i<methods.length; i++){
            Class[] types = methods[i].getParameterTypes();

            String parameters = "";
            for (int j=0; j<types.length; j++){
                parameters += types[j].getSimpleName() + ";";
            }

            System.out.println("Method: " + methods[i].getName() +
                    "; ReturnType:" + methods[i].getReturnType().getSimpleName() + "; Parameters: " + parameters);
        }

        System.out.println("getFields().length = " + k1.getFields().length);
        System.out.println("getDeclaredFields().length = " + k1.getDeclaredFields().length);


        /**
         * 反射操作
         */

        try {
            Kitty kitty = (Kitty)k1.newInstance();

            Method getColor = k1.getMethod("getColor");
            Method setColor = k1.getMethod("setColor", String.class);

            System.out.println("Color = " + (String)getColor.invoke(kitty));
            setColor.invoke(kitty, "BLACK");
            System.out.println("Color = " + (String)getColor.invoke(kitty));

        } catch (Exception e){
            e.printStackTrace();
        }


        /**
         * 通过泛型，了解反射操作是属于编译之后再进行的操作。编译之后，集合去泛型化。
         */
        ArrayList list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList<>();

        Class c1 = list1.getClass();
        Class c2 = list2.getClass();

        System.out.println(c1 == c2);

        // This is not allowed. But we can add it by reflection below.
        //list2.add(345);

        list2.add("111");
        System.out.println(list2);
        try {
            Method add = c2.getMethod("add", Object.class);
            add.invoke(list2, "123");
            add.invoke(list2, 345);

            System.out.println(list2.size());
            System.out.println(list2);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
