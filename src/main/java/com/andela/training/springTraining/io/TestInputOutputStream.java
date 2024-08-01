package com.andela.training.springTraining.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestInputOutputStream {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		//int b = is.read();
		//System.out.println("is = "+b);
		
//		InputStreamReader isr = new InputStreamReader(is);
//		int c = isr.read();
//		System.out.println("c = "+c);
		
		//ler primeira linha
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
//		String s = br.readLine();
//		System.out.println("s = "+s);
		
		
		//ler todas linhas, usando um laco
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		while(s !=null)
		{
			System.out.println("s = "+s);
			s = br.readLine();
		}
	}

}
