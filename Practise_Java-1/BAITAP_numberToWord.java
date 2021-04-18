import java.util.Scanner;

public class BAITAP_numberToWord {
    public static void hangDonVi(int number) {
        switch(number){
            case 0:
            System.out.println(" Zero");
            break;
            case 1:
            System.out.println(" One");
            break;
            case 2:
            System.out.println(" Two");
            break;
            case 3:
            System.out.println(" Three");
            break;
            case 4:
            System.out.println(" Four");
            break;
            case 5:
            System.out.println(" Five");
            break;
            case 6:
            System.out.println(" Six");
            break;
            case 7:
            System.out.println(" Seven");
            break;
            case 8:
            System.out.println(" Eight");
            break;
            case 9:
            System.out.println(" Nine");
            break;
        }
    }
    public static void hangChuc(int hangChuc) {
        switch(hangChuc){
            case 2:
            System.out.print("Twenty");
            break;
            case 3:
            System.out.print("Thirdty");
            break;
            case 4:
            System.out.print("Fourty");
            break;
            case 5:
            System.out.print("Fifty");
            break;
            case 6:
            System.out.print("Sixty");
            break;
            case 7:
            System.out.print("Seventy");
            break;
            case 8:
            System.out.print("Eighty");
            break;
            case 9:
            System.out.print("Ninety");
            break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number <10 && number >=0 ){
            hangDonVi(number);
        } else if (number < 0) {
            System.out.println("Out of ability");
        }

        if ( number >= 10 && number <20){
            number = number - 10;
            switch(number){
                case 0:
                System.out.println("Ten");
                break;
                case 1:
                System.out.println("Eleven");
                break;
                case 2:
                System.out.println("Twelve");
                break;
                case 3:
                System.out.println("Thirteen");
                break;
                case 4:
                System.out.println("Fourteen");
                break;
                case 5:
                System.out.println("Fifteen");
                break;
                case 6:
                System.out.println("Sixteen");
                break;
                case 7:
                System.out.println("Seventeen");
                break;
                case 8:
                System.out.println("Eighteen");
                break;
                case 9:
                System.out.println("Nineteen");
                break;
            }
        }

        if (number >=20 && number <100){
            int hangChuc = number/10;
            hangChuc(hangChuc);
            hangDonVi(number%10);
        }

        if(number >=100 && number < 1000){
            int hangCham = number/100;
            int hangChuc = (number-hangCham*100)/10;

            switch(hangCham){
                case 1:
                System.out.print(" One hundred ");
                break;
                case 2:
                System.out.print(" Two hundred ");
                break;
                case 3:
                System.out.print(" Three hundred ");
                break;
                case 4:
                System.out.print(" Four hundred ");
                break;
                case 5:
                System.out.print(" Five hundred ");
                break;
                case 6:
                System.out.print(" Six hundred ");
                break;
                case 7:
                System.out.print(" Seven hundred ");
                break;
                case 8:
                System.out.print(" Eight hundred ");
                break;
                case 9:
                System.out.print(" Nine hundred ");
                break; 
            }
            hangChuc(hangChuc);
            hangDonVi((number-hangCham*100-hangChuc*10)%10);
        }
    }
}

