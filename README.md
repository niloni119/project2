Report on Java Elevator Simulation Code

Introduction
The provided Java code simulates an elevator system operating in a building with multiple floors. 
The program models passenger calls for the elevator over a specified duration and processes the requests efficiently. 
The primary objective is to evaluate the total time required to serve all passenger requests and analyze the frequency of elevator calls from each floor.

Code Overview
The program follows these key steps:
Accepts user input for the number of floors, the maximum number of passengers per trip, and the simulation duration in minutes.
Uses randomization to generate passenger elevator calls throughout the simulation duration.
Processes elevator trips, moving between floors based on call requests.
Computes the total time required to fulfill all requests and outputs call frequency statistics.

Implementation Details
Input Handling
The program prompts the user to enter:
The number of floors (nf)
The maximum number of passengers per trip (mp)
The simulation duration in minutes (dur)
A Scanner object is used for input collection.

Passenger Call Simulation
A Random object generates random passenger calls at a rate of 0 to 2 calls per minute.
Calls are recorded in an ArrayList<Integer> pas, representing floors from which passengers request an elevator.
An ArrayList<Integer> callF is used to track the frequency of calls per floor.
Each generated call is printed to the console for tracking purposes.

Elevator Trip Processing
The elevator starts at floor 1 (cf = 1).
The program processes up to mp requests per trip.
Each request moves the elevator to a new floor, incrementing the total time required (t) based on the floor difference.
Requests are processed in the order they were generated (FIFO behavior using removeFirst()).

Results and Output
The program prints the total simulation time required to serve all calls.
It outputs the frequency of calls from each floor.
A summary message indicates the completion of the simulation.

Conclusion
This Java program effectively simulates an elevator's operation, considering real-time call frequency and movement between floors. 
While the current implementation provides valuable insights, incorporating advanced scheduling algorithms could further optimize performance. 
The simulation serves as a useful foundation for more complex elevator control systems.
