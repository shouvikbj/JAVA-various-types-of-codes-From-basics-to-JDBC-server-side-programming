public class box{
    int width, height, depth;
    box(int a, int b, int c){
        height = a;
        width = b;
        depth = c;
    }
    public void displayVolume(){
        int vol = (height*width*depth);
        System.out.println("Volume of the box is : "+vol);
    }
    public static void main(String[] args) {
        box b = new box(4,2,3);
        b.displayVolume();
    }
}