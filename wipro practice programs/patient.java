import java.util.Scanner;

class patient{
    
    String patientName;
    double height, weight;

    patient(String a, double b, Double c){
        patientName = a;
        height = b;
        weight = c;
    }

    public double computeBMI(){
        double BMI = weight / (height * height);
        System.out.println("Patient Name : "+patientName);
        return BMI;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = input.nextLine();
        System.out.print("Enter Height : ");
        double height = input.nextDouble();
        System.out.print("Enter Weight : ");
        double weight = input.nextDouble();

        patient p = new patient(name, height, weight);
        double BMI = p.computeBMI();
        System.out.println("BMI is : "+BMI);

        input.close();
    }
}