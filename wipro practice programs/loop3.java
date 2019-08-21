class loop3{
    public static void main(String[] args) {
        // char ch = args[0].charAt(0);
        // if(Character.isAlphabetic(ch)){
        //     System.out.println("Alphabet");
        // }
        if(args[0].matches("^[a-zA-Z]*$")){
            System.out.println("Alphabet");
        }
        else if(args[0].matches("[0-9]+")){
            System.out.println("Number");
        }
        else{
            System.out.println("Special Character");
        }
    }
}