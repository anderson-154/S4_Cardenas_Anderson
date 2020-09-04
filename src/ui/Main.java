package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static final String TEXT_INPUT = "data/Input2.txt";
	public static final String TEXT_OUTPUT = "data/Output2.txt";
	
	public static void main(String[]args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(TEXT_INPUT));
		BufferedWriter bw = new BufferedWriter(new FileWriter(TEXT_OUTPUT));
		
		
		String line;

		while((line=br.readLine())!=null) {
			
			System.out.println(line);
		
		}

		
		br.close();
		bw.close();
	}
}
