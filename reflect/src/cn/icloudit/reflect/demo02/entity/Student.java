package cn.icloudit.reflect.demo02.entity;

public class Student {
	private String name;
	private Integer age;

	
	public void readBook(IBook book) {
		book.read();
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
