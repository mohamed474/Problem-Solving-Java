package A;

import java.util.Scanner;
public class Vanya_and_Fence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int persons = scanner.nextInt();
        int wall = scanner.nextInt();
        int result = 0;

        while (persons != 0){
            int tallPerson = scanner.nextInt();
            result++;
            if (tallPerson > wall){
                result++;
            }
            persons--;
        }
        System.out.println(result);
    }
}