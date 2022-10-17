package com.mohit.corepatterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtil du1 = DateUtil.getInstance();
		String path = "E:\\Design Patterns\\Code\\CorePatterns\\resources\\dateUtil.ser";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)));
		oos.writeObject(du1);
		DateUtil du2 =null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)));
		du2 = (DateUtil) ois.readObject();
		oos.close(); ois.close();
//		System.out.println(du1+" "+du2);
		System.out.println(du1 == du2);
	}

}
