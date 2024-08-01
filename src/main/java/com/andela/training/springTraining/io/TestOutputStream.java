package com.andela.training.springTraining.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestOutputStream {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt",true);
		
		//escrever todas linhas, usando um laco
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Novas LInha no File");
		bw.close();
	}

}
