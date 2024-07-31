package core;

public class NthFibanoccinumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NthFibanoccinumber a = new NthFibanoccinumber();
		int n =5;
		System.out.println(a.number(n));
		
	}
		
		
		
		public int number(int n) {
		
			
		int first = 0;
		int second = 1;
		//System.out.print(first +""+second +" ");
		int result =0;
		for(int i=2;i<n;i++)
		{

		result = first + second;
		first = second;
		second = result;
		}
		return result;
	}

}
