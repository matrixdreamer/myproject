package cn.icloudit.reflect.demo02;

import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

import cn.icloudit.reflect.demo02.entity.IBook;
import cn.icloudit.reflect.demo02.entity.Student;

public class ClassDemo2 {

	@Test
	public void demo1() throws Exception {
		//创建properties对象
		Properties prop = new Properties();
		//加载applicationContext.properties文件为InputStream字节输入流
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("cn/icloudit/reflect/demo02/applicationContext.properties");
		//使用properties对象加载输入流
		prop.load(is);
		
		//从properties对象中获取key为book的Value，我们定义的是类名
		String className  = prop.getProperty("book");
		//通过反射机制加载该类并创建实例，获取我们想让学生读的book对象
		IBook book = (IBook) Class.forName(className).newInstance();
		//通过反射机制加载Student类并创建实例】
		
		String studentClassName = prop.getProperty("student");
		
		Student stu = (Student) Class.forName(studentClassName).newInstance();
		//将book对象传入到student的readBook文件中，完成读书
		stu.readBook(book);
	}
}
