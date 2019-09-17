package practice1.java;
import java.util.Scanner;

	public class Biggest1 
	{

		public static void main(String[] args) 
		{
			Biggest1 b=new Biggest1();
			b.Biggest();
			
		}
		
	    private void Biggest()
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
				System.out.println("enter the value of e");
				int e=sc.nextInt();
						
				if(a==b&&b==c&&c==d&&d==e&&e==a)
			            {
				        System.out.println("ALL ARE EQUAL");
			            }
				else if(a>b&&a>c&&a>d&&a>e)
				        {
						System.out.println("biggest is a=" +a);
						}
				
				else if(a==b&&a>c&&b>c&&a>d&&b>d&&a>e&&b>e)
		                {
			            System.out.println("both a anb b are equal and big a="+a+"b="+b);
		                }
		        else if(a==c&&a>b&&c>b&&a>d&&c>d&&a>e&&c>e)
		                {
			            System.out.println("both a and c are equal and big a="+a+"c="+c);
		                }
		        else if(a==d&&a>b&&d>b&&a>c&&d>c&&a>e&&d>e)
		                {
			            System.out.println("both a and d are equal and big a="+a+"d="+d);

		                }
		        else if(a==e&&a>b&&e>b&&a>c&&e>c&&a>d&&e>d)
		                {
		        	    System.out.println("both a and e are equal and big a="+a+"e="+e);
		                }
		        else if(a==b&&b==c&&c==d)
	                    {
	    	            System.out.println("a b c and d are equal and big a="+a+"b="+b+"c="+c+"d="+d);
	                    }

		        else if(a==b&&b==c)
		                {
		        	    System.out.println("a b and c are equal and  big a="+a+"b="+b+"c="+c);
		                }
		        else if(b>c&&b>d&&b>e)
				        {
		                System.out.println("biggest is b="+b);
		                }
		        
		        else if(b==c&&b>a&&c>a&&b>d&&b>d&&b>e&&c>e)
		                {
		        	    System.out.println("both b and c are equal and big b="+b+"c="+c);
		                }
		        else if(b==d&&b>a&&d>a&&b>c&&d>c&&b>e&&d>e)
		                {
		        	    System.out.println("both b and d are equal and big b="+b+"d="+d);	
		                }
		        else if(b==e&&b>c&&e>c&&b>d&&e>d&&b>a&&e>a)
		                {
		        	    System.out.println("both b and e are equal and big b="+b+"e="+e);
		                }
		        else if(b==c&&c==d&&d==e)
	                    {
	    	            System.out.println("b c d and e are equal and big b="+b+"c="+c+"d="+d+"e="+e);
	                    }
		        else if(b==c&&c==e)
	                    {
	    	            System.out.println("b c and e are equal and big b="+b+"c="+c+"e="+e);
	                    }
		        else if(b==c&&c==d)
	                    {
	                    System.out.println("b c and d are equal and big b="+b+"c="+c+"d="+d);
	                    }
		        else if(c>a&&c>d&&c>b&&c>e)
			            {
	                    System.out.println("biggest is c="+c);
	                    }
		        
		        else if(c==d&&c>a&&d>a&&c>b&&d>b&&c>e&&d>e)
		                {
		        	    System.out.println("both c and d are equal and big c="+c+"d="+d);
		                }
		        else if(c==e&&c>a&&e>a&&c>b&&e>b&&c>d&&e>d)
		                {
		        	   System.out.println("both c and e are equal and big c="+c+"e="+e);
		                }
		        else if(c==d&&d==e)
	                    {
	                    System.out.println("c d and e are equal and big c="+c+"d="+d+"e="+e);
	                    }
		        else if(d==e&&d>a&&e>a&&d>b&&e>b&&d>c&&e>c)
		                {
		        	    System.out.println("both d and e are equal and big d="+d+"e="+e);
		                }
		         else if(d>a&&d>b&&d>c&&d>e)
			    		{
		                System.out.println("biggest is d="+d);
		                }

		        else if(d==a&&a==b&&b==c)
		                {
		        	    System.out.println("a b c and d are equal and big a="+a+"b="+b+"c="+c+"d="+d);
		                }
		        else if(e>a&&e>b&&e>c&&e>d)
			            {
	                    System.out.println("biggest is e="+e);
	                    }
		        else if(a==c&&c==d&&d==e)
		                {
		        	    System.out.println(" a c d and e are equal and big a="+a+"c="+c+"d="+d+"e="+e);
		                }
		        
		        
				else
					System.out.println("Thank u");
			}
			
		
	}




	