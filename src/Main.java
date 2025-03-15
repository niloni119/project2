import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input:
        System.out.print("Enter the number of floors: ");
        int nf = input.nextInt();
        System.out.print("Enter the max number of passengers per trip: ");
        int mp = input.nextInt();
        System.out.print("Enter the simulation duration (in minutes): ");
        int dur = input.nextInt();

        Random rnd = new Random();
        ArrayList<Integer> callF = new ArrayList<>(Collections.nCopies(nf + 1, 0)); // To store call frequency for each floor
        ArrayList<Integer> pas = new ArrayList<>(); // To store passenger requests

        System.out.println("\nSimulating passenger calls...");

        // Simulate passenger calls over the specified duration:
        for (int min = 0; min < dur; min++) {
            int calls = rnd.nextInt(3); // Randomly generate 0 to 2 calls per minute
            for (int i = 0; i < calls; i++) {
                int f = rnd.nextInt(nf) + 1; // Randomly select a floor (1 to numFloors)
                pas.add(f); // Add the floor to the list
                callF.set(f, callF.get(f) + 1); // Increment the call frequency for the floor
                System.out.println("Passenger called elevator from floor " + f + ".");
            }
        }

        System.out.println("\nSimulation completed.\n");

        //Time and floors:
        int t = 0;
        int cf = 1; // Elevator starts at floor 1

        while (!pas.isEmpty()) {
            // Process up to maxPassengersPerTrip requests in one trip
            int passInTrip = Math.min(mp, pas.size());
            for (int i = 0; i < passInTrip; i++) {
                int targetFloor = pas.removeFirst(); // Get the next floor from the list (simulate dequeue)
                t += Math.abs(targetFloor - cf); // Add time to reach the next floor
                cf = targetFloor; // Move the elevator to the next floor
            }
        }

        // Results:
        System.out.println("Analysis:");
        System.out.println("Total time needed for all calls: " + t + " minutes");

        System.out.println("Frequency of calls from each floor:");
        for (int i = 1; i <= nf; i++) {
            System.out.println("Floor " + i + ": " + callF.get(i) + " calls");
        }

        System.out.println("\nThank you for using Elevator Simulation!");
    }
}
