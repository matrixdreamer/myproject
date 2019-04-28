package cn.icloudit.reflect.demo04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.junit.Test;

import cn.icloudit.reflect.demo04.entity.Student;

public class ClassDemo4 {

	@Test
	public void demo1() throws Exception {
		Constructor<Student> c = Student.class.getConstructor(String.class, int.class);
		Student stu = c.newInstance("张三",18);
	    Field[] fields = stu.getClass().getFields();
	    for(Field f : fields) {
	    	System.out.println(f);
	    }
	}
	@Test
	public void demo2() throws Exception {
		Constructor<Student> c = Student.class.getConstructor(String.class, int.class);
		Student stu = c.newInstance("张三",18);
	    Field[] fields = stu.getClass().getDeclaredFields();
	    for(Field f : fields) {
	    	System.out.println(f);
	    }
	}
	
	@Test
	public void demo3() throws Exception {
		//获取student有参构造函数
		Constructor<Student> c = Student.class.getConstructor(String.class, int.class);
		//使用构造函数创建实例
		Student stu = c.newInstance("张三",18);
		//获取Class对象
		Class clazz = stu.getClass();
	    //获取private字段name
		Field nameField = clazz.getDeclaredField("name");
		//跳过Java语言检查
	    nameField.setAccessible(true);
	    //取出stu对象name字段的值并打印
	    System.out.println(nameField.get(stu));  //张三
	    
	    //取出stu对象的sex字段，并赋值男.public可见字段不需要暴力获取
	    Field sexField = clazz.getField("sex");
	    sexField.set(stu, "男");
	    
	    //为stu对象的name字段赋值为李四
	    nameField.set(stu, "李四");
	    //输出
	    System.out.println(stu);  //李四 18 男
	}
	
}
