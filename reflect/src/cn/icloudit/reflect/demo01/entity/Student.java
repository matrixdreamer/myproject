package cn.icloudit.reflect.demo01.entity;

public class Student {
	private String name;
	private Integer age;

	
	public Student(String str) {
		System.out.println("student有参构造函数");
	}
	
	public Student() {
		System.out.println("student无参构造函数");
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
