package cn.icloudit.reflect.demo05.entity;

public class Student {
	private String name;
	private Integer age;
	public String sex;
	
	public void read(String book) {
		System.out.println(name + "在读" + book);
	}
	
	public void read() {
		System.out.println(name + "在读书");
	}

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
		
		return "[name="+name+ ",age="+age+"，sex="+ sex + "]";
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
