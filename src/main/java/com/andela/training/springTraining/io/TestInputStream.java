package com.andela.training.springTraining.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestInputStream {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
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