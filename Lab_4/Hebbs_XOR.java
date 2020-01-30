package Lab_4;

public class Hebbs_XOR {

	public static void main(String args[]) {
		Integer[]x1= {1,1,-1,-1};
		Integer[]x2= {1,-1,1,-1};
		Integer[]y= {-1,1,1,-1};

		int w1=0,w2=0,b=0,cw1,cw2,cb;
		System.out.println("XOR Gate Using Hebbs Rule:\n");

		System.out.println("x1\tx2\ty\tchange w1\tchange w2\tchange b\tw1\tw2\tb");
		for(int i=0;i<4;i++) {
			cw1=x1[i]*y[i];
			cw2=x2[i]*y[i];
			cb=y[i];  
			
			w1+=cw1;
			w2+=cw2;
			b+=cb;

			System.out.println(x1[i]+"\t"+x2[i]+"\t"+y[i]+"\t"+cw1+"\t\t"+cw2+"\t\t"+cb+"\t\t"+w1+"\t"+w2+"\t"+b);
		}

//System.out.println(+" \t"+w1+" \t"+w2+"\t\t"+b);
               
	}
}