package cn.icloudit.reflect.demo04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.junit.Test;

import cn.icloudit.reflect.demo04.entity.Student;

public class ClassDemo4 {

	@Test
	public void demo1() throws Exception {
		Constructor<Student> c = Student.class.getConstructor(String.class, int.class);
		Student stu = c.newInstance("����",18);
	    Field[] fields = stu.getClass().getFields();
	    for(Field f : fields) {
	    	System.out.println(f);
	    }
	}
	@Test
	public void demo2() throws Exception {
		Constructor<Student> c = Student.class.getConstructor(String.class, int.class);
		Student stu = c.newInstance("����",18);
	    Field[] fields = stu.getClass().getDeclaredFields();
	    for(Field f : fields) {
	    	System.out.println(f);
	    }
	}
	
	@Test
	public void demo3() throws Exception {
		//��ȡstudent�вι��캯��
		Constructor<Student> c = Student.class.getConstructor(String.class, int.class);
		//ʹ�ù��캯������ʵ��
		Student stu = c.newInstance("����",18);
		//��ȡClass����
		Class clazz = stu.getClass();
	    //��ȡprivate�ֶ�name
		Field nameField = clazz.getDeclaredField("name");
		//����Java���Լ��
	    nameField.setAccessible(true);
	    //ȡ��stu����name�ֶε�ֵ����ӡ
	    System.out.println(nameField.get(stu));  //����
	    
	    //ȡ��stu�����sex�ֶΣ�����ֵ��.public�ɼ��ֶβ���Ҫ������ȡ
	    Field sexField = clazz.getField("sex");
	    sexField.set(stu, "��");
	    
	    //Ϊstu�����name�ֶθ�ֵΪ����
	    nameField.set(stu, "����");
	    //���
	    System.out.println(stu);  //���� 18 ��
	}
	
}
