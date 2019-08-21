class loop12{
    public static boolean isPalindrome(String str){
        String output = "";
        int len = str.length();
        for(int k=len-1; k>=0; --k){
            output = output + str.charAt(k);
        }
        if(output.equals(str))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String input = args[0];
        if(isPalindrome(input))
            System.out.println(input + " -> Palindrome !!");
        else
            System.out.println(input + " -> Not Palindrome !!");
    }
}