package core;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			int n =5;
			int first =0;
			int second =1;
			System.out.print(first + " " + second + " ");
			for(int i=2;i<n;i++)
			{
				int result = first + second;
				first = second;
				second = result;
				System.out.print(result+ " ");
			}
			
		}
		

	}


