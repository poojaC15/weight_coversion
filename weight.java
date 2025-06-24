
import java.util.Scanner;
public class weight{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double new_weight;
        int choice;
       System.out.println("Weight conversion program");
       System.out.println("Choice 1 lbs to kgs");
       System.out.println("Choice 2 kgs to lbs ");

       System.out.println("Choose an option");
       choice = scanner.nextInt();

       if(choice == 1){
        System.out.println("Enter weight in lbs");
        weight = scanner.nextDouble();
        new_weight = weight * 0.453592;

        System.out.print("The new weight in kgs " +new_weight);


       }
       else if(choice == 2){
        System.out.println("Enter weight in kgs:");
        weight = scanner.nextDouble();
        new_weight = weight *2.85462;

        System.out.printf("The new weight in lbs: %.2f ",new_weight);
       }
       else{
        System.out.print("Not a valid choice");

       }
     scanner.close();
    }
}