public class Series {


		public static void sine(int x,int n)
		{
			int p=1,sign=1;
			double s=0.0,t=0.0;
			for(int i=1;i<=n;i++)
			{
				t=(Math.pow(x, p)/fact(p))*sign;
				p+=2;
				s+=t;
				sign*=-1;
			}
			System.out.println("Ans: "+s);
		}
		public static void cosine(int x,int n)
		{
			int p=2,sign=-1;
			double s=1.0,t=0.0;
			for(int i=2;i<=n;i++)
			{
				t=(Math.pow(x, p)/fact(p))*sign;
				p+=2;
				s+=t;
				sign*=-1;
			}
			System.out.println("Ans: "+s);
		}
		private static double fact(int n)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			return fact;
		}
        
		public static void main(String[] args) {
		Series.sine(1, 2);
		Series.cosine(1,2);

	}
}
