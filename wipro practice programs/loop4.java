class loop4{
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        if(Character.isUpperCase(ch)){
            String lowerCh = args[0].toLowerCase();
            System.out.println(args[0]+" -> "+lowerCh);
        }
        else{
            String upperCh = args[0].toUpperCase();
            System.out.println(args[0]+" -> "+upperCh);
        }
    }
}