package _1_2_object_oriented_programming._1_2_2_inheritance._3_method_overriding;

public class MethodOverridingExample {
    public static void main(String[] args) {
        Printer printer = new ColorPrinter();
        printer.print(); // Calls overridden method in ColorPrinter
    }
}

class Printer {
    void print() {
        System.out.println("Printing document");
    }
}

class ColorPrinter extends Printer {
    @Override
    void print() {
        System.out.println("Printing in color");
    }
}