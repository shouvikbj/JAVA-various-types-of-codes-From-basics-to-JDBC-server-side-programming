class loop9{
    public static void main(String[] args) {
        int sum = 0;
        String num = args[0];
        for(int i=0; i<num.length(); ++i){
            // char ch = num.charAt(i);
            sum = sum + Character.getNumericValue(num.charAt(i));
        }
        System.out.println("Sum -> "+sum);
    }
}