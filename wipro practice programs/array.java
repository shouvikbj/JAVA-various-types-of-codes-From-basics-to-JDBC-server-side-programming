class array{
    public static void main(String[] args) {
        int arr[] = {4,6,1,10,14};
        int sum = 0;
        for(int i : arr){
            sum = sum+i;
        }
        System.out.println("Sum : "+sum);
        int avg = sum / (arr.length);
        System.out.println("Average : "+avg);
    }
}