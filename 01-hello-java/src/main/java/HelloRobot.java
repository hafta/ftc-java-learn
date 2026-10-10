/*
 * Lesson 1: Hello, Robot!
 *
 */

// Every Java program lives inside a "class". The class name must match the
// file name: class HelloRobot lives in HelloRobot.java.
public class HelloRobot {

    public static void main(String[] args) {
        System.out.println("Hello, Robot!");

        // "double" means a number that can have a decimal point.
        double wheelDiameterInches = 4.0;

        // "int" is a whole number in java. It has a range of
        // -2^(31) to 2^{31} - 1.
        // int numberOfWheels = 4;

        double wheelDiameterCm = inchesToCentimeters(wheelDiameterInches);

        System.out.println("Our wheel is " + wheelDiameterInches +
                " inches, which is " + wheelDiameterCm + " cm.");

        // Static methods can also be called using the class
        // name in front. This is how you call a static method that lives in a
        // DIFFERENT class. Uncomment the line below and run it.
        // System.out.println("Using the class name: " + HelloRobot.inchesToCentimeters(1.0));

        // EXPERIMENT
        // Call the method printWheelCircumference() and pass the wheel diameter.
    }

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public void printWheelCircumference(double diameter) {
        // Math is in the java.lang package, and Java imports everything in
        // java.lang into every file automatically. That's also why System and
        // String work without an import. Some other java.lang classes you'll
        // see a lot are Integer, Double, Object and Thread.
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
        double circumference = Math.PI * diameter;
        System.out.println("A wheel with diameter " + diameter +
                " has a circumference of " + circumference + ".");
    }

    // private static void printTeamGreeting() {
    //     System.out.println("Go team 12345!");
    // }

    // EXPERIMENT:
    // Change printTeamGreeting() so it takes a parameter, like this:
    // private static void printTeamGreeting(int teamNumber)
    // and prints that number instead.

    // EXPERIMENT:
    // Change printTeamGreeting() so it is not static.
}
