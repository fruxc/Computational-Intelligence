package Lab_2;


import java.util.*;
class Gate1{
	int b,n,w=1,n1;
	int v[][];
	int a[];
	Scanner in=new Scanner(System.in);
	void get_data() {
		
		System.out.println("Enter Value of bias:");
		b=in.nextInt();
		System.out.println("Enter Number of User input you want..");
		n=in.nextInt();
		System.out.println("Enter data you want in per input:");
		n1=in.nextInt();
	}	
		void get_data1() {
			v=new int[n][n1];
			a = new int[n1];
			for(int i=0;i<n;i++) {	
				System.out.println("Enter Binary Value for X "+(i+1));
				System.out.println("Weight w1:1 and w2:1");
				System.out.print("\t Values of X"+ (i+1));
				System.out.println("\n");
				for(int j=0;j<n1;j++)
				{
					v[i][j]=in.nextInt();
				}	
			}
			
		/*
		 * System.out.println("Input Matrix is:"); for(int i=0;i<n;i++) {
		 * System.out.print("X[" + i + "] \t"); }System.out.print("\t"+"OR"); for(int
		 * i=0;i<n1;i++) { int sum=0; System.out.println(); for(int j=0;j<n;j++) {
		 * System.out.print(v[j][i]+"\t"); sum=sum+(v[j][i]*1); }
		 * System.out.print("\t"); a[i]=sum; System.out.println(a[i]); }
		 */
			System.out.println("OR GATE MATRIX IS:");
			System.out.print("X1 \tX2 \t\tY \tYin");

			for(int i=0;i<n1;i++) {
				int sum=0;
				System.out.println();
				for(int j=0;j<n;j++) {
					System.out.print(v[j][i]+"\t");
					sum=sum+(v[j][i]*1);
			}
				System.out.print("\t");
				a[i]=sum;
				if(a[i]>=1) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				System.out.print("\t");
				a[i]=sum;
				System.out.print(a[i]);
		
			}
		
	}
	
}
public class OR_Gate {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		Gate1 g=new Gate1();
		g.get_data();
		g.get_data1();
		in.close();
	}
}

