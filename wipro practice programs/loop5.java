class loop5{
    public static void main(String[] args) {
        args[0] = args[0].toUpperCase();
        char colorCode = args[0].charAt(0);
        String color = null;
        switch(colorCode){
            case 'R':
                color = "Red";
                break;
            case 'B':
                color = "Blue";
                break;
            case 'G':
                color = "Green";
                break;
            case 'Y':
                color = "Yellow";
                break;
            case 'O':
                color = "Orange";
                break;
            case 'W':
                color = "White";
                break;
            default:
                System.out.println("Invalid Code !!");
                break;
        }
        System.out.println(args[0]+" -> "+color);
    }
}