package com.andela.training.springTraining.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestInputOutputStreamIdentifyComments {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		int i = 0;

		// ler todas linhas, usando um laco
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		while (s != null) {
			if (s.startsWith("//") || s.startsWith("/*")) {
				System.out.println("s = " + s);
			} else {
				i++;
			}
			s = br.readLine();
		}
		System.out.println("Total de linhas Encontramos " + i);
	}

}
