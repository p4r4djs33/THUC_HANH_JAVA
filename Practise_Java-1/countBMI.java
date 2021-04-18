import java.util.Scanner;

public class countBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can nang: ");
        float weight = sc.nextFloat();
        System.out.println("Chieu cao: ");
        float height = sc.nextFloat();
        float bmi = (weight)/(height*height);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (bmi < 25.0){
            System.out.println("Normal");
        } else if (bmi < 30.0){
            System.out.print("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
