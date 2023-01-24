import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Getting input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Printing array values: ");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}