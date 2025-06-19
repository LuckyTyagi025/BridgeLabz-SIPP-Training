import java.util.Scanner;

public class TravelInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the name of the From City: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the name of the Via City: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the name of the To City: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " in hours: ");
        double time1 = input.nextDouble();

        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " in hours: ");
        double time2 = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = time1 + time2;
        double averageSpeed = totalDistance / totalTime;

        System.out.println("\nHello " + name + "!");
        System.out.println("You traveled from " + fromCity + " to " + toCity + " via " + viaCity);
        System.out.println("Total distance covered: " + totalDistance + " miles");
        System.out.println("Total time taken: " + totalTime + " hours");
        System.out.println("Average speed: " + averageSpeed + " miles/hour");
    }
}
