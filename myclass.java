class MyClass {
    // Static variable to keep track of the number of objects created
    static int count = 0;

    // Constant variable for the value of PI
    final double PI = 3.1415;

    // Constructor
    public MyClass() {
        count++; // Increment the count each time an object is created
    }

    public static void main(String[] args) {
        // Creating objects of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Print the final values of count and PI
        System.out.println("Final value of count: " + count);
        System.out.println("Value of PI: " + obj1.PI); // Accessing PI through an object
    }
}