package practice1.java;
import java.util.Scanner;

public class Biggest
{
		
		public static void main(String[] args)
		{
			Biggest b=new Biggest();
			b.biggest();
			
		}

	
		private void biggest()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of a");
			int a=sc.nextInt();
			System.out.println("enter the value of b");
			int b=sc.nextInt();
			System.out.println("enter the value of c");
			int c=sc.nextInt();
			System.out.println("enter the value of d");
			int d=sc.nextInt();
					
			if(a==b&&b==c&&c==d&&d==a)
		            {
			        System.out.println("ALL ARE EQUAL");
		            }
			else if(a>b&&a>c&&a>d)
			        {
					System.out.println("biggest is a=" +a);
					}
			else if(a==b&&a>c&&b>c&&a>d&&b>d)
	                {
		            System.out.println("both a anb b are equal and big a="+a+"b="+b);
	                }
	        else if(a==c&&a>b&&c>b&&a>d&&c>d)
	                {
		            System.out.println("both a and c are equal and big a="+a+"c="+c);
	                }
	        else if(a==d&&a>b&&d>b&&a>c&&d>c)
	                {
		            System.out.println("both a and d are equal and big a="+a+"d="+d);

	                }
	        else if(a==b&&b==c)
	                {
	        	    System.out.println("a b and c are equal and  big a="+a+"b="+b+"c="+c);
	                }
	        else if(b>c&&b>d)
			
	                {
	        	    System.out.println("biggest is b="+b);
	                }
	        else if(b==c&&b>a&&c>a&&b>d&&b>d)
	                {
	        	    System.out.println("both b and c are equal and big b="+b+"c="+c);
	                }
	        else if(b==d&&b>a&&d>a&&b>c&&d>c)
	                {
	        	    System.out.println("both b and d are equal and big b="+b+"d="+d);	
	                }
	        else if(b==c&&c==d)
	                {
	        	    System.out.println("b c and d are equal and big b="+b+"c="+c+"d="+d);
	                }
	        else if(c>a&&c>b&&c>d)
	    		    {
		            System.out.println("biggest is c="+c);
	                }
	        else if(c==d&&c>a&&d>a&&c>b&&d>b)
	                {
	        	    System.out.println("both c and d are equal and big c="+c+"d="+d);
	                }
	        else if(d>a&&d>b&&d>c)
	    		
	                {
		            System.out.println("biggest is d="+d);
	                }
	        else if(d==a&&a==b)
	                {
	        	    System.out.println("d a and b are equal and big d="+d+"a="+a+"b="+b);
	                }
	        else if(a==c&&c==d)
	                {
	        	    System.out.println(" a c and d are equal and big a="+a+"c="+c+"d="+d);
	                }
	        
			
			else
				System.out.println("Thank u");
		}
		
	}
	