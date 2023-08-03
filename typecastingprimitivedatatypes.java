package gtjune2023;

public class typecastingprimitivedatatypes {
	public static void main(String[] args) {
        // Declaration and initialization of primitive data types
        // byte
        byte byteVar = 10;

        // short
        short shortVar = 100;

        // int
        int intVar = 1000;

        // long
        long longVar = 100000L;

        // float
        float floatVar = 3.14f;

        // double
        double doubleVar = 3.14159;

        // char
        char charVar = 'A';

        // boolean
        boolean booleanVar = true;

        // Implicit and Explicit Type Casting
        // Implicit type casting (Widening Conversion): Smaller data type to Larger data type
        shortVar = byteVar; // byte can be implicitly cast to short
        intVar = shortVar; // short can be implicitly cast to int
        longVar = intVar; // int can be implicitly cast to long
        floatVar = longVar; // long can be implicitly cast to float
        doubleVar = floatVar; // float can be implicitly cast to double

        // Explicit type casting (Narrowing Conversion): Larger data type to Smaller data type
        doubleVar = 3.14159;
        floatVar = (float) doubleVar; // double needs to be explicitly cast to float
        longVar = (long) floatVar; // float needs to be explicitly cast to long
        intVar = (int) longVar; // long needs to be explicitly cast to int
        shortVar = (short) intVar; // int needs to be explicitly cast to short
        byteVar = (byte) shortVar; // short needs to be explicitly cast to byte

        // char to int and vice versa
        charVar = 'B';
        intVar = charVar; // char can be implicitly cast to int
        charVar = (char) intVar; // int needs to be explicitly cast to char

        // boolean to numeric types and vice versa
        booleanVar = true;
        // boolean cannot be implicitly or explicitly cast to numeric types
        // You can use ternary operator to assign numeric values based on boolean value
        intVar = booleanVar ? 1 : 0; // Assigns 1 to intVar if booleanVar is true, otherwise 0
        booleanVar = intVar != 0; // Assigns true to booleanVar if intVar is not 0, otherwise false
    }
}


