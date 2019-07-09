package project;

import java.io.*;



public class OSprojecttesing extends osproject{
	static void castFileIntoArrays(File file,String[] jobNames,int[] timeNeeded) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String str;
		int line = 0;
		int row = 0;
		while((str = reader.readLine())!=null) {
			if(line == 0) {
				jobNames[row] = str;
				line++;
			}else {
				timeNeeded[row]= Integer.parseInt(str);
				line--;
				row++;
			}
		}
		
		reader.close();
	}
	public static void main(String args[]) throws IOException {
		int count =0; 
		int count1=0;
		int count2=0;
		System.out.println("\ntestdata1.txt: ");
		while(count<=4) {
			String jobNumber[] = new String[6];
			int jobtime[] = new int[6];
			castFileIntoArrays(new File("C:\\Users\\liste\\Downloads\\testdata1.txt"), jobNumber, jobtime);
			if(count==0) {
				System.out.println("First Come First Serve:");
				fcfs(jobNumber, jobtime);}
			if(count==1) {
				System.out.println("\nShortest job first: ");
				shortestjobfirst(jobNumber, jobtime);}
			if(count==2) {
				System.out.println("\nRound Robin 2: ");
				RR2(jobNumber, jobtime);}
			if(count==3) {
				System.out.println("\nRound Robin 5: ");
				RR5(jobNumber, jobtime);}	
			count++;
			}
		System.out.println("\ntestdata2.txt: ");
		while(count1<=4) {
			String jobNumber[] = new String[10];
			int jobtime[] = new int[10];
			castFileIntoArrays(new File("C:\\Users\\liste\\Downloads\\testdata2.txt"), jobNumber, jobtime);
			if(count1==0) {
				System.out.println("First Come First Serve:");
				fcfs(jobNumber, jobtime);}
			if(count1==1) {
				System.out.println("\nShortest job first: ");
				shortestjobfirst(jobNumber, jobtime);}
			if(count1==2) {
				System.out.println("\nRound Robin 2: ");
				RR2(jobNumber, jobtime);}
			if(count1==3) {
				System.out.println("\nRound Robin 5: ");
				RR5(jobNumber, jobtime);}	
			count1++;
			}
		System.out.println("\ntestdata3.txt: ");
		while(count2<=4) {
			String jobNumber[] = new String[18];
			int jobtime[] = new int[18];
			castFileIntoArrays(new File("C:\\Users\\liste\\Downloads\\testdata3.txt"), jobNumber, jobtime);
			if(count2==0) {
				System.out.println("First Come First Serve:");
				fcfs(jobNumber, jobtime);}
			if(count2==1) {
				System.out.println("\nShortest job first: ");
				shortestjobfirst(jobNumber, jobtime);}
			if(count2==2) {
				System.out.println("\nRound Robin 2: ");
				RR2(jobNumber, jobtime);}
			if(count2==3) {
				System.out.println("\nRound Robin 5: ");
				RR5(jobNumber, jobtime);}	
			count2++;
			}
		}
}
