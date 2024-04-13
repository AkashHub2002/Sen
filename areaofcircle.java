import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        // double area = 3.14*r*r;
        // or 
        float area = 3.14f *r*r;
        System.out.println("the area is : " + area);
    }
}
