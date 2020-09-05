package com.smart.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 功能描述：反射类测试
 *
 * @author: xiaozhameng
 * @date: 2020-05-18 13:41
 */
public class ReflectTest {

    public static Car initByDefaultConst() throws Throwable {
        // 通过类加载器获取Car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?> tClass = loader.loadClass("com.smart.reflect.Car");

        // 获取类的构造器
        Constructor<?> cons = tClass.getDeclaredConstructor(null);
        Car car = (Car) cons.newInstance();

        // 通过反射设置属性，调用方法
        Method setBrand = tClass.getDeclaredMethod("setBrand", String.class);
        Object setRes = setBrand.invoke(car, "红旗");
        System.out.println("invoke - res: "+ setRes);

        Method getColor = tClass.getDeclaredMethod("getColor");
        Object getRes = getColor.invoke(car);
        System.out.println("invoke - res: "+ getRes);

        return car ;
    }

    public static void main(String[] args) throws Throwable {
        Car car = initByDefaultConst();
        car.introduce();
    }

}
