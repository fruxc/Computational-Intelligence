package Lab_3;

import java.util.Scanner;

public class XOR_Gate {
	static int w1=1,w2=1,w3=1,u,b=0,z1,z2;
	static int[] x1 = {1,1,1,1,0,0,0,0};
	static int[] x2 = {1,1,0,0,1,1,0,0};
	 static int[] x3 = {1,0,1,0,1,0,1,0}; 
	
	static int[] xor = {1,0,0,1,0,1,1,0};
	static Scanner sc = new Scanner(System.in);
	
	static int calcz1(int a, int b) {
		if(b == 0) {
			b = 1;
		}
		else {
			b = 0;
		}
		int z = a * b; //compliment x2
		return z;
	}

	static int calcz2(int a, int b) {
		if(a == 0) {
			a = 1;
		}
		else {
			a = 0;
		}
		int z = a * b; //compliment x1
		return z;
	}
	
//  3 input XOR GATE
	public static void main(String[] args) {
		System.out.println("XOR GATE MATRIX:\n");
		System.out.println("X1\tX2\tX3\tTarget\tActual");
		for(int i = 0; i < 8; i++ ) {
			z1 = calcz1(x1[i],x2[i]);
			z2 = calcz2(x1[i],x2[i]);

			int y = z1*w1 + z2*w2;
			
			z1 = calcz1(y,x3[i]);
			z2 = calcz2(y,x3[i]);
			u =  z1*w2 + z2*w3;
			
			System.out.println(x1[i]+"\t"+x2[i]+"\t"+x3[i]+"\t"+xor[i]+"\t"+u);
			//if(u%2==0) {				
//				u = 0;
//				System.out.println(x1[i]+"\t"+x2[i]+"\t"+x3[i]+"\t"+xor[i]+"\t"+u);
//			}
//			else {
//				u = 1;
//				System.out.println(x1[i]+"\t"+x2[i]+"\t"+x3[i]+"\t"+xor[i]+"\t"+u);
			//}
		}
				
}
}
