class loop8{
    public static boolean isPrime(int num){
        boolean flag = false;
        for(int i=2; i<=num/2; ++i){
            if(num % i == 0){
                flag = true;
                break;
            }
        }
        if(!flag)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        for(int j=10; j<=99; ++j){
            // boolean result = isPrime(j);
            if(isPrime(j)){
                System.out.print(j+", ");
            }
        }
    }
}