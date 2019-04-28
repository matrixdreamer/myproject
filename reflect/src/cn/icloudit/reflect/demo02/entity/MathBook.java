package cn.icloudit.reflect.demo02.entity;

public class MathBook implements IBook{

	@Override
	public void read() {
		System.out.println("我在阅读数学书");
	}

}
