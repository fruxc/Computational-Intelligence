package Lab_6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Adaline {
    private static DecimalFormat df = new DecimalFormat("#.###");
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("OR Gate using Adaline:\n");
		int x1[] = {1, -1, 1, -1};
		int x2[] = {1, 1, -1, -1};
		int y[] = {1,1,1,-1};
		double t[] = new double[4];
		double t2[] = new double[4];
		double yin[] = new double[4];
		double alpha, w1, w2, b, dw1 = 0, dw2 = 0, db = 0, td = 1;
		w1 = w2 = b = alpha = 0.1; 
		for(int e=0; e<10; e++)
		{
			System.out.print("Iteration:"+(e+1)+"\n\n");
			System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println("x1\t x2\t y\t y(in)\t    t(calc)\t     D(w1)\t D(w2)\t D(b)\t w1\t w2\t b\tt^2");
			System.out.println("------------------------------------------------------------------------------------------------------------");

			for(int i=0; i<4; i++)
			{
				if(i==0) { td = 0;}
				yin[i]=(x1[i]*w1+x2[i]*w2)+b;
				t[i]=(y[i]-yin[i]);
				t2[i]= Math.pow(t[i], 2);
				dw1=(alpha*t[i]*x1[i]);
				dw2=(alpha*t[i]*x2[i]);
				db=(alpha*t[i]);
				w1+=dw1;
				w2+=dw2;
				b+=db;
				td+=t2[i];
				System.out.println(x1[i]+"\t"+x2[i]+"\t"+y[i]+"\t"+df.format(yin[i])+"\t\t"+df.format(t[i])+"\t\t"+df.format(dw1)+"\t"+df.format(dw2)+"\t"+df.format(db)+"\t"+df.format(w1)+"\t"+df.format(w2)+"\t"+df.format(b)+"\t"+df.format(t2[i]));
			}
			System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println("\nFinal Weights after Epoch "+(e+1)+":");
			System.out.println("w1:" +df.format(w1));
			System.out.println("w2:" +df.format(w2));
			System.out.println("b: " +df.format(b));
			System.out.println("td: " +df.format(td)+"\n");
			System.out.println("------------------------------------------------------------------------------------------------------------\n");
		}
		s.close();
	}
}