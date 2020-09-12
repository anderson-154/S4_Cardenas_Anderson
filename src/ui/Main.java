package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[]args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		int n = Integer.parseInt(line);
		DecimalFormat df = new DecimalFormat("#.0#");
	    df.setRoundingMode(RoundingMode.FLOOR);

		double round=0;
		double count=0;
		double imprDouble=0;
		for(int g=0;g<n;g++) {
			String [] parts = br.readLine().split(" ");
			double [] nums = new double[parts.length];
			
			for(int i=0;i<parts.length;i++) {
				nums[i] = Double.parseDouble(parts[i]);
			}
			
			for(int j=nums.length-1;j>0;j--) {
				round++;
				for(int k=0;k<j;k++) {
					if(nums[k]>nums[k+1]) {
						double temp=nums[k];
						nums[k]=nums[k+1];
						nums[k+1]=temp;
						count++;
					}
				}
			}
			imprDouble=count/round;
			
			count=0;
			round=0;
			String output=df.format(imprDouble)+"-";
			for(int f=0;f<nums.length;f++) {
				output+=nums[f]+" ";
			}
			bw.write(output.trim()+"\n");
		}
		
		bw.close();
		br.close();
	}
}
