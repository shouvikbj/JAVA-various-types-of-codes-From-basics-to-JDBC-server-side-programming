class array3{
    public static void main(String[] args) {
        int num[] = {65, 120, 98, 75, 115};
        String str = null;
        for(int i : num){
            str = Character.toString((char)i);
            System.out.print(str+" ");
        }
    }
}