package Lab_5;
import java.util.*;

public class PerceptronOR {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("OR Gate using perceptron:\n");
		int x1[] = {1,1,0,0};
		int x2[] = {1,0,1,0};
		int y[] = {1,1,1,-1};
		int t[] = new int[4];
		int yin[] = new int[4];
		int w1 = 0, w2 = 0, b = 0, dw1 = 0, dw2 = 0, db = 0, alpha = 1;
		double theta = 0.2;
		for(int e=0; e<3; e++)
		{
			System.out.print("Iteration:"+(e+1)+"\n\n");
			System.out.println("---------------------------------------------------------------------------------------------------------");
			System.out.println("x1\t x2\t y\t y(in)\t    t(calc)\t     D(w1)\t D(w2)\t D(b)\t w1\t w2\t b\t");
			System.out.println("---------------------------------------------------------------------------------------------------------");
			for(int i=0; i<4; i++)
			{
				yin[i]=(x1[i]*w1+x2[i]*w2)+b;
				if(yin[i]>theta)
					t[i]=1;
				else if(-theta <= yin[i] && yin[i] <= theta)
					t[i]=0;
				
				if(t[i]!=y[i])
				{
					dw1=alpha*x1[i]*y[i];
					dw2=alpha*x2[i]*y[i];
					db=alpha*y[i];
					w1+=dw1;
					w2+=dw2;
					b+=db;
					System.out.println(x1[i]+"\t"+x2[i]+"\t"+y[i]+"\t"+yin[i]+"\t\t"+t[i]+"\t\t"+dw1+"\t"+dw2+"\t"+db+"\t"+w1+"\t"+w2+"\t"+b+"\t");
				}
				else {
					System.out.println(x1[i]+"\t"+x2[i]+"\t"+y[i]+"\t"+yin[i]+"\t\t"+t[i]+"\t\tNil\tNil\tNil\t"+w1+"\t"+w2+"\t"+b+"\t");
				}				
			}
			System.out.println("---------------------------------------------------------------------------------------------------------");
			System.out.println("\nFinal Weights after Epoch "+(e+1)+":");
			System.out.println("w1:" +w1);
			System.out.println("w2:" +w2);
			System.out.println("b: " +b+"\n");
			System.out.println("---------------------------------------------------------------------------------------------------------\n");
		}
		s.close();
	}
}

	


