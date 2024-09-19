package _1_1_java_basics._1_1_2_data_types_and_variables._1_primitive_data_types;

public class PrimitiveExercises {
    public static void main(String[] args) {
        /*
         * Byte Exercise: Age Calculation
         * Write a program that calculates your age in months given your age in years.
         */
        byte ageInYears = 25;
        byte ageInMonths = (byte) (ageInYears * 12);
        System.out.println("Age in months: " + ageInMonths);

        /*
         * Short Exercise: Distance Conversion
         * Write a program that converts a distance in kilometers to meters.
         */
        short distanceInKilometers = 120;
        int distanceInMeters = distanceInKilometers * 1000;
        System.out.println("Distance in meters: " + distanceInMeters);

        /*
         *Int Exercise: Population Growth
         * Write a program that simulates population growth over a year, given an initial population and a growth rate.
         */
        int initialPopulation = 100000;
        int growthRate = 5; // Growth rate in percentage
        int finalPopulation = initialPopulation + (initialPopulation * growthRate / 100);
        System.out.println("Population after one year: " + finalPopulation);

        /*
         * Long Exercise: Large Number Multiplication
         * Write a program that multiplies two large numbers.
         * */
        long num1 = 123456789L;
        long num2 = 987654321L;
        long result = num1 * num2;
        System.out.println("Multiplication result: " + result);

        /*
         * Double Exercise: Precise Division
         * Write a program that performs division with high precision.
         */
        float radius = 7.5f;
        float area = (float) (Math.PI * radius * radius);
        System.out.println("Area of the circle: " + area);

        /*
         * Float Exercise: Circle Area Calculation
         * Write a program that calculates the area of a circle given its radius.
         */
        double dividend = 10.0;
        double divisor = 3.0;
        double resultd = dividend / divisor;
        System.out.println("Division result: " + resultd);

        /*
         * Char Exercise: Initials Extraction
         * Write a program that extracts and prints the initials from a full name.
         * */
        String fullName = "John Doe";
        char firstInitial = fullName.charAt(0);
        char secondInitial = fullName.charAt(fullName.indexOf(" ") + 1);
        System.out.println("Initials: " + firstInitial + secondInitial);

        /*
         * Boolean Exercise: Leap Year Check
         * Write a program that checks if a given year is a leap year.
         * */
        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Is leap year: " + isLeapYear);
    }
}
