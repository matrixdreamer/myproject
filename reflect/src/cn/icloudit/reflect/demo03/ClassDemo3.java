package cn.icloudit.reflect.demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

import org.junit.Test;

import cn.icloudit.reflect.demo03.entity.Student;

public class ClassDemo3 {

	@Test
	public void demo1() throws Exception {
		//��ȡStudent���в���Ϊ(String,int)�Ĺ��췽��
		Class clazz = Student.class;
		Constructor<Student> c = clazz.getConstructor(String.class, int.class);
		//ʹ�ù��캯������student���󣬲��������
		Student stu = c.newInstance("����",18);
		System.out.println(stu);
		
	}
	
	@Test
	public void demo2() throws Exception {
		//��ȡStudent����private���췽���������ȡ����ı�����ȡ����
		Constructor<Student> c = Student.class.getDeclaredConstructor(String.class);
		//�������䣬����java���Է��ʼ��
		c.setAccessible(true);
		//ʹ�ù��캯������student����,û�в���
		Student stu = c.newInstance("����");
		System.out.println(stu);
	}
	
	@Test
	public void demo3() throws Exception {
		//��ȡStudent����private���췽���������ȡ����ı�����ȡ����
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
