package cn.icloudit.reflect.demo01.entity;

public class Student {
	private String name;
	private Integer age;

	
	public Student(String str) {
		System.out.println("student�вι��캯��");
	}
	
	public Student() {
		System.out.println("student�޲ι��캯��");
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
