
// Printer.java
public class Printer {

    // Method to print a String
    public void printData(String text) {
        System.out.println("Printing text: " + text);
    }

    // Overloaded method to print an int
    public void printData(int number) {
        System.out.println("Printing number: " + number);
    }
}

// Main.java
public class Main5 {
    public static void main(String[] args) {
        // Create Printer object
        Printer printer = new Printer();

        // Call printData with a String
        printer.printData("Hello, world!");

        // Call printData with an int
        printer.printData(12345);
    }
}
