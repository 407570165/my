package com.justin;

import java.io.FileInputStream;

public class Main {
	public static void main(String[] args)throws Exception {
	FileInputStream fis =new FileInputStream("result.txt");
	int n =fis.read();
	try {
	while(n!=-1) {
		System.out.println((char)n);
		n=fis.read();
	}
	}catch(Exception e ) {
		
	}finally {
		if(fis!=null ) {
			try {
			fis.close();
		}catch(Exception e) {
			
		}
		}
	}
	}
}
