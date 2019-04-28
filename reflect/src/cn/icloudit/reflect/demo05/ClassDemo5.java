package cn.icloudit.reflect.demo05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;


import cn.icloudit.reflect.demo05.entity.Student;

public class ClassDemo5 {

	@Test
	public void demo01() throws Exception{
		//获取student有参构造函数
		Constructor<Student> c = Student.class.getConstructor(String.class, int.class);
		//使用构造函数创建实例
		Student stu = c.newInstance("张三",18);
		//获取Class对象
		Class clazz = stu.getClass();

		//获取stu对象中无参方法read
		Method m = clazz.getMethod("read");
		//调用stu对象中无参方法read
		m.invoke(stu);

		//获取stu对象中有参方法read
		Method m2 = clazz.getMethod("read", String.class);
		//调用stu对象中有参方法read
		m2.invoke(stu, "JAVA高级");
		
		
	}
}
