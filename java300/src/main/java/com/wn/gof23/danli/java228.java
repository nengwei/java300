package com.wn.gof23.danli;

import java.io.Serializable;

/**
 * 单例模式： 静态内部类实现方式（懒加载方式）
 * 
 * @author weineng
 *
 */
/**
 *1、外部类没有static属性，则不会像饿汉式那样立即加载对象。
 *2、只有真正调用getInstance()，才会加载静态内部类。加载类时是线程安全的。instance是static final类型，保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全性。
 *3、兼具了并发高效调用和延迟加载的优势
 *
 */
public class java228  implements Serializable{

	private static class SingletonClassInstance {
		private static final java228 instance = new java228();
	}

	private java228() {
	}

	public static java228 getInstance() {
		return SingletonClassInstance.instance;
	}

}
