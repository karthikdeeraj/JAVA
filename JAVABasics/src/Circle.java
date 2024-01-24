public class Circle { // Creating a class
    double radius; // Declaring a variable

    public Circle(double radius) {  // Creating a constructor
        this.radius = radius; // For taking input
    }
    // Creating a function to find area of circle
    public void area() {
        System.out.println("The area of the cirle is :" + (3.14 * radius * radius));

    }
    // Creating a function to find perimeter of circle
    public void perimeter(){
        System.out.println("The perimeter of the cirle is :" + (2 * 3.14 * radius));
    }
}