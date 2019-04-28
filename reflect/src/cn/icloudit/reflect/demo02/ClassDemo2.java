package cn.icloudit.reflect.demo02;

import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

import cn.icloudit.reflect.demo02.entity.IBook;
import cn.icloudit.reflect.demo02.entity.Student;

public class ClassDemo2 {

	@Test
	public void demo1() throws Exception {
		//����properties����
		Properties prop = new Properties();
		//����applicationContext.properties�ļ�ΪInputStream�ֽ�������
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("cn/icloudit/reflect/demo02/applicationContext.properties");
		//ʹ��properties�������������
		prop.load(is);
		
		//��properties�����л�ȡkeyΪbook��Value�����Ƕ����������
		String className  = prop.getProperty("book");
		//ͨ��������Ƽ��ظ��ಢ����ʵ������ȡ��������ѧ������book����
		IBook book = (IBook) Class.forName(className).newInstance();
		//ͨ��������Ƽ���Student�ಢ����ʵ����
		
		String studentClassName = prop.getProperty("student");
		
		Student stu = (Student) Class.forName(studentClassName).newInstance();
		//��book�����뵽student��readBook�ļ��У���ɶ���
		stu.readBook(book);
	}
}
