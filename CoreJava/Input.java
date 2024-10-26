package CoreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        // case 1
        BufferedReader br = null;
        Scanner sc = null;
        int num;
        int num2;
        try {
            System.out.print("Enter a number using BufferReader: ");
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println("Your number: " + num);

            // case 2
            System.out.print("Enter a number using Scanner: ");
            sc = new Scanner(System.in);
            num2 = sc.nextInt();
            System.out.println("Your number: " + num2);
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
