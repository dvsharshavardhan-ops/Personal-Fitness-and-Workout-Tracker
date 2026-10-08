import java.util.Scanner;

public class FitnessTracker {

    // Method to calculate total of an integer array
    static int calculateTotal(int[] data) {
        int total = 0;

        for (int i = 0; i < data.length; i++) {
            total = total + data[i];
        }

        return total;
    }

    // Method to calculate total of a double array
    static double calculateTotal(double[] data) {
        double total = 0;

        for (int i = 0; i < data.length; i++) {
            total = total + data[i];
        }

        return total;
    }

    // Method to check fitness goal
    static void checkGoal(String goalName, double total, double target) {

        if (total >= target)
System.out.println(goalName + " : Achieved");
        else
System.out.println(goalName + " : Not Achieved");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

System.out.println("===== FITNESS TRACKER =====");

        // User details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();

        // Arrays to store 7 days of fitness data
        int[] steps = new int[7];
        double[] calories = new double[7];
        double[] water = new double[7];
        int[] workout = new int[7];

        // For loop for 7 days
        for (int day = 0; day < 7; day++) {

System.out.println("\n===== DAY " + (day + 1) + " =====");

            System.out.print("Enter steps walked: ");
            steps[day] = sc.nextInt();

            System.out.print("Enter calories burned: ");
            calories[day] = sc.nextDouble();

            System.out.print("Enter water intake (litres): ");
            water[day] = sc.nextDouble();

            System.out.print("Enter workout time (minutes): ");
            workout[day] = sc.nextInt();
        }

        // Calling methods to calculate weekly totals
        int totalSteps = calculateTotal(steps);
        double totalCalories = calculateTotal(calories);
        double totalWater = calculateTotal(water);
        int totalWorkout = calculateTotal(workout);

        // Weekly report
System.out.println("\n===== WEEKLY FITNESS REPORT =====");

System.out.println("Name           : " + name);
System.out.println("Age            : " + age);
System.out.println("Weight         : " + weight + " kg");

System.out.println("Total Steps    : " + totalSteps);
System.out.println("Total Calories : " + totalCalories + " kcal");
System.out.println("Total Water    : " + totalWater + " litres");
System.out.println("Total Workout  : " + totalWorkout + " minutes");

        // Fitness status
System.out.println("\n===== FITNESS STATUS =====");

        checkGoal("Weekly Steps Goal", totalSteps, 70000);
        checkGoal("Weekly Water Goal", totalWater, 14);
        checkGoal("Weekly Workout Goal", totalWorkout, 210);
        checkGoal("Weekly Calories Goal", totalCalories, 2100);

System.out.println("\nKeep moving and stay healthy!");

sc.close();
    }
}
