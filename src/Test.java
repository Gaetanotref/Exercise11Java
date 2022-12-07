import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house1=new House();


        System.out.println("Insert address: ");
        house1.setAddress(scanner.nextLine());
        System.out.println("Insert number of floor: ");
        house1.setFloorNumber(scanner.nextInt());
        System.out.println("Insert the name of the residents separated by a comma ");
        house1.setResidentsNames(scanner.next().split(","));
        house1.getDetails();
    }
}
