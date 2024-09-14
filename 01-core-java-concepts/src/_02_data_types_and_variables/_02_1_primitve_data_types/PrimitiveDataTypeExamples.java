package _02_data_types_and_variables._02_1_primitve_data_types;

public class PrimitiveDataTypeExamples {
    public static void main(String[] args) {
        // byte: 8-bit integer
        byte byteMin = Byte.MIN_VALUE; // -128
        byte byteMax = Byte.MAX_VALUE; // 127
        System.out.println("byte: Min = " + byteMin + ", Max = " + byteMax);
        // Used for small range values. Suitable for age as it typically ranges from 0 to 127.
        byte age = 25;
        System.out.println("Age: " + age);

        // short: 16-bit integer
        short shortMin = Short.MIN_VALUE; // -32768
        short shortMax = Short.MAX_VALUE; // 32767
        System.out.println("short: Min = " + shortMin + ", Max = " + shortMax);
        // Suitable for year as it covers a larger range than byte, but less than int.
        short year = 2023;
        System.out.println("Year: " + year);

        // int: 32-bit integer
        int intMin = Integer.MIN_VALUE; // -2147483648
        int intMax = Integer.MAX_VALUE; // 2147483647
        System.out.println("int: Min = " + intMin + ", Max = " + intMax);
        // Commonly used for integer values that fit within a larger range. Suitable for city population.
        int cityPopulation = 500000;
        System.out.println("City Population: " + cityPopulation);

        // long: 64-bit integer
        long longMin = Long.MIN_VALUE; // -9223372036854775808L
        long longMax = Long.MAX_VALUE; // 9223372036854775807L
        System.out.println("long: Min = " + longMin + ", Max = " + longMax);
        // Used for very large values. Suitable for astronomical distances, which can be very large.
        long distanceToStar = 9460730472580800L; // Approximate distance in light years
        System.out.println("Distance to Star: " + distanceToStar + " light years");

        // float: Single-precision 32-bit floating-point
        float floatMin = -Float.MAX_VALUE; // -3.4028235E38
        float floatMax = Float.MAX_VALUE;  // 3.4028235E38
        System.out.println("float: Min = " + floatMin + ", Max = " + floatMax);
        // Suitable for decimal values where precision to around 7 decimal digits is sufficient.
        // Used for product prices where extreme precision is not necessary.
        float productPrice = 19.95f;
        System.out.println("Product Price: $" + productPrice);

        // double: Double-precision 64-bit floating-point
        double doubleMin = -Double.MAX_VALUE; // -1.7976931348623157E308
        double doubleMax = Double.MAX_VALUE;  // 1.7976931348623157E308
        System.out.println("double: Min = " + doubleMin + ", Max = " + doubleMax);
        // Suitable for decimal values requiring higher precision (up to 15 decimal digits).
        // Used for precise measurements in scientific calculations.
        double preciseMeasurement = 0.000123456789;
        System.out.println("Precise Measurement: " + preciseMeasurement);

        // char: 16-bit Unicode character
        char charMin = Character.MIN_VALUE; // '\u0000'
        char charMax = Character.MAX_VALUE; // '\uffff'
        System.out.println("char: Min = " + (int) charMin + " (\\u0000), Max = " + (int) charMax + " (\\uffff)");
        // Suitable for storing single characters. Used for grading systems where a single character represents a grade.
        char grade = 'A';
        System.out.println("Grade: " + grade);

        // boolean: Represents true or false
        boolean booleanFalse = Boolean.FALSE; // false
        boolean booleanTrue = Boolean.TRUE;   // true
        System.out.println("boolean: False = " + booleanFalse + ", True = " + booleanTrue);
        // Suitable for binary conditions. Used for representing an on/off state, like whether a light is on.
        boolean isLightOn = false;
        System.out.println("Is the light on? " + isLightOn);
    }
}
