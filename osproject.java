package project;
import java.util.List;
import java.util.Arrays;
public class osproject {
	//function for the first come first serve
	public static void fcfs(String jobnumber[], int jobtime[]) {
		int n = jobnumber.length;
		int starttime[] = new int[n]; //create an array for the start time
		starttime[0] = 0;	//set the Initial start time equals to 0
		int endtime[] = new int[n]; //create an array for the end time
		endtime[0]=jobtime[0];	// set the Initial end time equals to the first job completion time
		for(int i=1; i<jobnumber.length;i++) {	//calculate for the end time
			endtime[i] = endtime[i-1] + jobtime[i]; 
			starttime[i] = endtime[i-1];		//calculate for the start time
		}
		int totalturnaroundtime = 0;	//Initial the total turn around time equals 0
		for(int i=0; i<jobtime.length; i++) {
			totalturnaroundtime = totalturnaroundtime + endtime[i];	//calculate for the total turn around time
		}
		System.out.println("________________________________________________________________________");
		System.out.printf("|\tJob#\t|   Start time\t|   Endtime\t|\tJob completion \t|\n");
		for(int i = 0; i<jobnumber.length; i++) {
			System.out.printf("|\t"+jobnumber[i]+"\t|");
			System.out.printf("\t%d\t|",starttime[i]);
			System.out.printf("\t%d\t|",endtime[i]);	
			System.out.printf("job "+jobnumber[i]+" completed at %d\t|\n",endtime[i]);
		}
		System.out.println("________________________________________________________________________");
		float avgturnaroundtime = (float) totalturnaroundtime / (float) n;
		System.out.print("the average turnaround time is: ");
		System.out.print(avgturnaroundtime+"\n");
		}
	//function for the shortest job first 
	public static void shortestjobfirst(String jobnumber[], int jobtime[]) {
		int n = jobnumber.length;
		int temp;
		for(int i=1; i<n;i++) {	//sorting the array
			for(int j=i; j>0;j--) {
				if(jobtime[j]<jobtime[j-1]) {
					temp = jobtime[j];
					jobtime[j] = jobtime[j-1];
					jobtime[j-1]= temp;
					
					String jobnumbertemp = jobnumber[j];//sorting the job number's array
					jobnumber[j] = jobnumber[j-1];
					jobnumber[j-1] = jobnumbertemp;
				}
			}
		}
		int starttime[] = new int[n]; //create an array for the start time
		starttime[0] = 0;	//set the Initial start time equals to 0
		int endtime[] = new int[n]; //create an array for the end time
		endtime[0]=jobtime[0];	// set the Initial end time equals to the first job completion time
		for(int i=1; i<jobnumber.length;i++) {	//calculate for the end time
			endtime[i] = endtime[i-1] + jobtime[i]; 
			starttime[i] = endtime[i-1];		//calculate for the start time
		}
		int totalturnaroundtime = 0;	//Initial the total turn around time equals 0
		for(int i=0; i<jobtime.length; i++) {
			totalturnaroundtime = totalturnaroundtime + endtime[i];	//calculate for the total turn around time
		}
		System.out.println("________________________________________________________________________");
		System.out.printf("|\tJob#\t|   Start time\t|   Endtime\t|\tJob completion \t|\n");
		for(int i = 0; i<jobnumber.length; i++) {
			System.out.printf("|\t"+jobnumber[i]+"\t|");
			System.out.printf("\t%d\t|",starttime[i]);
			System.out.printf("\t%d\t|",endtime[i]);	
			System.out.printf("job "+jobnumber[i]+" completed at %d\t|\n",endtime[i]);
		}
		System.out.println("________________________________________________________________________");
		float avgturnaroundtime = (float) totalturnaroundtime / (float) n;
		System.out.print("the average turnaround time is: ");
		System.out.print(avgturnaroundtime+"\n");
		}
	public static void RR5(String jobnumber[], int jobtime[]) {
		int n = jobtime.length;
		int completiontime[] = new int[n];
		int starttime = 0;
		int endtime = 0;
		System.out.println("________________________________________________________________________");
		System.out.printf("|\tJob#\t|   Start time\t|   Endtime\t|\tJob completion \t|\n");
		int totalfinishtime = 0;
		for(int i =0; i<n;i++) {
			totalfinishtime = totalfinishtime + jobtime[i];
		}
		while(totalfinishtime>-5000) {
			for(int i = 0; i<jobtime.length; i++) {
				if(jobtime[i]<=5 && jobtime[i]>0) {
					System.out.printf("\n|\t"+jobnumber[i]+"\t|");
					System.out.printf("\t%d\t|",starttime);
					endtime = endtime + jobtime[i];
					starttime = endtime;
					completiontime[i]=endtime;
					System.out.printf("\t%d\t|",endtime);	
					jobtime[i]= jobtime[i]-endtime;
					if(jobtime[i]<=0)
						System.out.printf("job "+jobnumber[i]+" completed at %d\t|",endtime);
					totalfinishtime = totalfinishtime - endtime;	
				}
				else if(jobtime[i]>5) {
					System.out.printf("|\n\t"+jobnumber[i]+"\t|");
					System.out.printf("\t%d\t|",starttime);
					endtime = endtime +5;
					starttime = endtime;
					System.out.printf("\t%d\t",endtime);	
					jobtime[i] = jobtime[i]-5;
				}
				else if(jobtime[i]<=0) {
					continue;
					
				}}
				totalfinishtime = totalfinishtime -5;
				
			}
		int totalturnaroundtime = 0;
		for(int i=0; i<n; i++) {
			totalturnaroundtime = totalturnaroundtime + completiontime[i];
		}
		float avgturnaroundtime = (float)totalturnaroundtime / (float)n;
		System.out.println("");
		System.out.println("the average turnaround time is: ");
		System.out.print(avgturnaroundtime);
		}
	
	public static void RR2(String jobnumber[], int jobtime[]) {
		int n = jobtime.length;
		int completiontime[] = new int[n];
		int starttime = 0;
		int endtime = 0;
		System.out.println("________________________________________________________________________");
		System.out.printf("|\tJob#\t|   Start time\t|   Endtime\t|\tJob completion \t|\n");
		int totalfinishtime = 0;
		for(int i =0; i<n;i++) {
			totalfinishtime = totalfinishtime + jobtime[i];
		}
		while(totalfinishtime>-5000) {
			for(int i = 0; i<jobtime.length; i++) {
				if(jobtime[i]<=2 && jobtime[i]>0) {
					System.out.printf("\n|\t"+jobnumber[i]+"\t|");
					System.out.printf("\t%d\t|",starttime);
					endtime = endtime + jobtime[i];
					starttime = endtime;
					completiontime[i]=endtime;
					System.out.printf("\t%d\t|",endtime);	
					jobtime[i]= jobtime[i]-endtime;
					if(jobtime[i]<=0)
						System.out.printf("job "+jobnumber[i]+" completed at %d\t|",endtime);
					totalfinishtime = totalfinishtime - endtime;	
				}
				else if(jobtime[i]>2) {
					System.out.printf("|\n\t"+jobnumber[i]+"\t|");
					System.out.printf("\t%d\t|",starttime);
					endtime = endtime +2;
					starttime = endtime;
					System.out.printf("\t%d\t",endtime);	
					jobtime[i] = jobtime[i]-2;
				}
				else if(jobtime[i]<=0) {
					continue;
					
				}}
				totalfinishtime = totalfinishtime -2;
				
			}
		int totalturnaroundtime = 0;
		for(int i=0; i<n; i++) {
			totalturnaroundtime = totalturnaroundtime + completiontime[i];
		}
		float avgturnaroundtime = (float)totalturnaroundtime / (float)n;
		System.out.println("");
		System.out.println("the average turnaround time is: ");
		System.out.print(avgturnaroundtime);
		}
			

}
