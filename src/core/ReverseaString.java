package core;

public class ReverseaString {

    public static void main(String[] args) {
        System.out.println("Starting the program...");
        ReverseaString demo = new ReverseaString();
        String input = "hello";
        String reversed = demo.reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public String reverseString(String input) {
        if (input == null) {
            return input;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}

