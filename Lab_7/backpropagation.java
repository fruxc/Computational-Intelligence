package Lab_7;
import java.util.Scanner;
import java.text.DecimalFormat;

public class backpropagation {

    private static DecimalFormat df = new DecimalFormat("#.###");
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("BackPropagation:\n");
		System.out.println("Iteration 1");
		int x1= 0, x2= 1, c=1, i;
		double b[]={0.3, 0.5}, cb[]= {0, 0}, v1[]= {0.6, -0.3}, v2[]= {-0.1, 0.4}, cv1[]= {0, 0},cv2[]= {0, 0};
		double w0=-0.2, w[]= {0.4, 0.1};
		double cw0, cw[]= {0, 0};
		double din[]= {0, 0};
		int t=1;
		double alpha=0.25;
		double zin[]= {0, 0},zind[]= {0, 0},z[]= {0, 0}, yin, y, yind, dk, dh[]= {0, 0};
		for(i=0; i<2; i++) {
			zin[i]=x1*v1[i]+x2*v2[i]+b[i];
			z[i]=(1/(1+Math.exp(-c*zin[i])));
			System.out.println("zin = "+df.format(zin[i]));
			System.out.println("z = "+df.format(z[i]));
		}
		yin=z[0]*w[0]+z[1]*w[1]+w0;
		System.out.println("yin = "+df.format(yin));
		y=(1/(1+Math.exp(-c*yin)));
		System.out.println("y = "+df.format(y));
		yind=y*(1-y);
		System.out.println("yind = "+df.format(yind));
		dk=(t-y)*(yind);
		System.out.println("dk = "+df.format(dk));
		
		for(i=0; i<2; i++) {
			cw[i]=alpha*dk*z[i];
			System.out.println("cw = "+df.format(cw[i]));
		}
		cw0=alpha*dk;
		System.out.println("cw0 = "+df.format(cw0));
		for(i=0; i<2; i++) {
			din[i] = dk*w[i];
			zind[i]=z[i]*(1-z[i]);
			dh[i]=din[i]*zind[i];
			System.out.println("din = "+df.format(din[i]));
			System.out.println("zind = "+df.format(zind[i]));
			System.out.println("dh = "+df.format(dh[i]));
		}
		cv1[0]=alpha*dh[0]*x1;
		cv1[1]=alpha*dh[0]*x2;
		cb[0]=alpha*dh[0];
		cv2[0]=alpha*dh[1]*x1;
		cv2[1]=alpha*dh[1]*x2;
		cb[1]=alpha*dh[1];
		System.out.println("cv1 = "+df.format(cv1[0]));
		System.out.println("cv1 = "+df.format(cv1[1]));
		System.out.println("cb1 = "+df.format(cb[0]));
		System.out.println("cv2 = "+df.format(cv2[0]));
		System.out.println("cv2 = "+df.format(cv2[1]));
		System.out.println("cb2 = "+df.format(cb[1]));
		w0+=cw0;
		System.out.println("w0 = "+df.format(w0));
		for(i=0; i<2; i++) {
			w[i]+=cw[i];
			System.out.println("w = "+df.format(w[i]));
			v1[i]+=cv1[i];
			System.out.println("v1 = "+df.format(v1[i]));
			v2[i]+=cv2[i];
			System.out.println("v2 = "+df.format(v2[i]));
			b[i]+=cb[i];
			System.out.println("b = "+df.format(b[i]));
		}
		
		s.close();
	}
}