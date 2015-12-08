import java.util.Scanner;
public class main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle (cm):");
        int base = sc.nextInt();
        System.out.println("Enter the height of the triangle (cm):");
        int height = sc.nextInt();
        int area = (base*height)/2
        System.out.println("The area of the triangle is" + area"cm²")
    }
}