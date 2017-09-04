package com.wn.thread.java173;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * @author nengwei
 *
 */
public class Call {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 创建线程
		ExecutorService ser = Executors.newFixedThreadPool(1);
		Race tortoise = new Race();
		// 获取值
		Future<Integer> result = ser.submit(tortoise);
		int num = result.get();
		System.out.println(num);
		// 停止服务
		ser.shutdown();
	}

}

class Race implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return 100;
	}

}