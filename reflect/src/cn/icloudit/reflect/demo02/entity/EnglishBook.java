package cn.icloudit.reflect.demo02.entity;

public class EnglishBook implements IBook{

	public EnglishBook(String str) {
		System.out.println("englishbook有参构造函数");
	}
	
	public EnglishBook() {}
	@Override
	public void read() {
		System.out.println("我在阅读英语书");
	}
}
