class loop2{
    public static void main(String[] args) {
        char ch1 = args[0].charAt(0);
        char ch2 = args[1].charAt(0);
        if(ch1 <= ch2){
            System.out.println(args[0]+","+args[1]);
        }
        else{
            System.out.println(args[1]+","+args[0]);
        }
    }
}