package com.wn.gof23.danli;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 对象序列化与反序列化
 * 
 * @author weineng
 *
 */
public class Client {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		try {
			//序列化
			FileOutputStream fos = new FileOutputStream("/Users/nengwei/Documents/1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			User u = new User();
			u.setId(1);
			oos.writeObject(u);// 将user对象存入1.txt文档

			oos.close();
			fos.close();
			
			//反序列化
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/nengwei/Documents/1.txt"));
			User u1 = (User) ois.readObject();
			System.out.println(u1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
