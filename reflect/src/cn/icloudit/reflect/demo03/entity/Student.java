package cn.icloudit.reflect.demo03.entity;

public class Student {
	private String name;
	private Integer age;

	/**
	 * �вι��캯��
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * ˽�й��캯��
	 * @param name
	 */
	private Student(String name) {
		this.name = name;
	}
	
	/**
	 * �޲ι��캯��
	 */
	public Student() {
		
	}
	
	@Override
	public String toString() {
		
		return "[name="+name+ ",age="+age+"]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
