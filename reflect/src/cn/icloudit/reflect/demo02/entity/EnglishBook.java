package cn.icloudit.reflect.demo02.entity;

public class EnglishBook implements IBook{

	public EnglishBook(String str) {
		System.out.println("englishbook�вι��캯��");
	}
	
	public EnglishBook() {}
	@Override
	public void read() {
		System.out.println("�����Ķ�Ӣ����");
	}
}
