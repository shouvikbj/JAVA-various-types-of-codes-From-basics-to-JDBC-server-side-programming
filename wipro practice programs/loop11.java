class loop11{
    public static void main(String[] args) {
        String input = args[0];
        String output = "";
        int len = input.length();
        for(int i=len-1; i>=0; --i){
            // System.out.print(input.charAt(i));
            output = output + input.charAt(i);
        }
        System.out.println(input+" -> "+output);
    }
}