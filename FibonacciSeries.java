package assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
	int a=0,b=1,i,count=8;
	System.out.println(a);
	System.out.println(b);
	for(i=2;i<count;++i)
	{
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}

	}

}
