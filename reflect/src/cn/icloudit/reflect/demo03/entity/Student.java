package cn.icloudit.reflect.demo03.entity;

public class Student {
	private String name;
	private Integer age;

	/**
	 * 有参构造函数
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 私有构造函数
	 * @param name
	 */
	private Student(String name) {
		this.name = name;
	}
	
	/**
	 * 无参构造函数
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
