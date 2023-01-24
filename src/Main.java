import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Array of objects
        String [] str = new String[4];
        for (int i =0; i<str.length; i++){
            str[i]=scanner.next();
        }
        System.out.println(Arrays.toString(str));
        }


    }
