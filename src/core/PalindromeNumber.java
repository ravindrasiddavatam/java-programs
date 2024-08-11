package core;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println(pn.isPalindrome(145));

	}
	
	public boolean isPalindrome(int x) {

        if(x<0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while(x>0) {
            int digit = x%10;
            reversed = reversed*10+digit;
            x/=10;

        }
        return original == reversed;
        
    }
}
