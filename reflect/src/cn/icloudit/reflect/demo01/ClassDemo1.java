package cn.icloudit.reflect.demo01;

import org.junit.Test;

import cn.icloudit.reflect.demo01.entity.Student;



/**
 * 这是反射测试类
 * @author Administrator
 *
 */
public class ClassDemo1 {

	@Test
	public void demo1() throws ClassNotFoundException {
		//1.使用Class.forName()获取Class实例对象，因为class是关键字，所以我们命名为clazz
		Class clazz1 = Class.forName("cn.icloudit.reflect.demo01.entity.Student");
		
		//2.通过类的静态变量class来获取Class实例对象
		Class clazz2 = Student.class;
		
		//3.通过对象的getClass()方法获取Class实例对象
		/*
		 * Student s = new Student(); Class clazz3 = s.getClass();
		 */
		
		//测试上述三个Class实例对象是否为同一个对象：结果true
		System.out.println(clazz1 == clazz2);
		/*
		 * System.out.println(clazz2 == clazz3); System.out.println(clazz1 == clazz3);
		 */
	}

}
