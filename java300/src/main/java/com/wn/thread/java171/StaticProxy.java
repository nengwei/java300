package com.wn.thread.java171;

/**
 * 静态代理设计模式： 1、真是角色 2、代理角色 :持有真实角色的引用 3、二者实现相同接口
 * 
 * @author nengwei
 *
 */
public class StaticProxy {

	public static void main(String[] args) {
		WeddingCompany weddingCompany = new WeddingCompany(new You());
		weddingCompany.before();
		weddingCompany.marry();
		weddingCompany.after();
	}

}

// 共同接口
interface Marry {
	public abstract void marry();
}

// 真实角色
class You implements Marry {

	@Override
	public void marry() {
		System.out.println("我结婚。。。");
	}

}

// 代理角色
class WeddingCompany implements Marry {

	private Marry you;

	public WeddingCompany() {
	}

	public WeddingCompany(Marry you) {
		this.you = you;
	}

	public void before() {
		System.out.println("婚庆公司准备布景");
	}

	@Override
	public void marry() {
		you.marry();
	}

	public void after() {
		System.out.println("婚庆公司撤除布景");
	}
}