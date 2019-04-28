package cn.icloudit.reflect.demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

import org.junit.Test;

import cn.icloudit.reflect.demo03.entity.Student;

public class ClassDemo3 {

	@Test
	public void demo1() throws Exception {
		//获取Student类中参数为(String,int)的构造方法
		Class clazz = Student.class;
		Constructor<Student> c = clazz.getConstructor(String.class, int.class);
		//使用构造函数创建student对象，并传入参数
		Student stu = c.newInstance("张三",18);
		System.out.println(stu);
		
	}
	
	@Test
	public void demo2() throws Exception {
		//获取Student类中private构造方法，必须采取下面的暴力获取方法
		Constructor<Student> c = Student.class.getDeclaredConstructor(String.class);
		//暴力反射，跳过java语言访问检查
		c.setAccessible(true);
		//使用构造函数创建student对象,没有参数
		Student stu = c.newInstance("李四");
		System.out.println(stu);
	}
	
	@Test
	public void demo3() throws Exception {
		//获取Student类中private构造方法，必须采取下面的暴力获取方法
		Constructor<Student>[] cs = (Constructor<Student>[]) Student.class.getDeclaredConstructors();
		
		for(Constructor c : cs) {
			System.out.println(c.getName() + "\t" + c.getParameterCount());
			Parameter[] paras = c.getParameters();
			for(Parameter p : paras) {
				System.out.print(p.getName() + "\t");
			}
			System.out.println();
		}
		
	}
}
