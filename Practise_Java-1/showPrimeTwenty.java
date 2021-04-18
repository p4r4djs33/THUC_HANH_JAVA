public class showPrimeTwenty {
    public static boolean check(int num) { 
        int count = 0;
            for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                count++;
            }
        }
        if (count == 0)
        return true;
        else return false;
    }
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count <20){
            if ( check(num) == true){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
