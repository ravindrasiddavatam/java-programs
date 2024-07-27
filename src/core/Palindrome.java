package core;

public class Palindrome{
public static void main(String[] args){
Palindrome pd = new Palindrome();
String a = "MOM";
String b = pd.palindrome("dsa");
if(a.equals(b)){
System.out.println("palindrome");
}else {
	System.out.println("not a palindrome");
	}
}


public String palindrome(String input){
StringBuilder sb = new StringBuilder();
for(int i=input.length()-1;i>=0;i--){
sb.append(input.charAt(i));
}
return sb.toString();
}
}