package problem1a;

public class Main {
	public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(3, 5);
        Sphere sphere = new Sphere(4);
        Cube cube = new Cube(2);

        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());

        System.out.println("Sphere Volume: " + sphere.volume());
        System.out.println("Sphere Surface Area: " + sphere.surfaceArea());

        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.surfaceArea());
    }
}
