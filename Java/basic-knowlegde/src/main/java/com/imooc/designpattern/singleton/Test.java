package com.imooc.designpattern.singleton;

public class Test {
    /**
     * 单例模式
     *
     * 应用场景：
     *      工具类，日志对象等有且只有一个的对象。
     *
     * 分类：
     *      饿汉模式（Eager Mode）、懒汉模式（Lazy Mode）
     *
     * 区别：
     *      饿汉模式在加载类的时候，就创建实例了，加载慢但获取快。懒汉模式反之。
     *      饿汉模式是线程安全的，懒汉模式不是。
     *
     *      所以，推荐使用 饿汉模式。
     */
    public static void main(String[] args){
        SingletonOfEagerMode eager1 = SingletonOfEagerMode.getInstance();
        SingletonOfEagerMode eager2 = SingletonOfEagerMode.getInstance();

        if (eager1 == eager2){
            System.out.println("OK! eager1 == eager2");
        } else {
            System.out.println("ERROR! eager1 != eager2");
        }

        SingletonOfLazyMode lazy1 = SingletonOfLazyMode.getInstance();
        SingletonOfLazyMode lazy2 = SingletonOfLazyMode.getInstance();

        if (lazy1 == lazy2){
            System.out.println("OK! lazy1 == lazy2");
        } else {
            System.out.println("ERROR! lazy1 != lazy2");
        }
    }
}
