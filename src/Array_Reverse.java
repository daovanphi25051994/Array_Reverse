import java.util.Scanner;

public class Array_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = scanner.nextInt();
        
        if (size > 1 && size <= 20) {
            int[] arrayNumbers = new int[size];
            for (int i = 0; i < arrayNumbers.length; i++) {
                System.out.printf("array[%d] = ", i);
                arrayNumbers[i] = scanner.nextInt();
            }
            System.out.printf("%-20s%s", "Elements in array: ", "");
            for (int j = 0; j < arrayNumbers.length; j++) {
                System.out.print(arrayNumbers[j] + "\t");
            }
            for (int x = 0; x < arrayNumbers.length / 2; x++) {
                int temp = arrayNumbers[arrayNumbers.length - 1 - x];
                arrayNumbers[arrayNumbers.length - 1 - x] = arrayNumbers[x];
                arrayNumbers[x] = temp;
            }
            System.out.printf("%-20s%s", "Elements in reverse array: ", "");
            for (int y = 0; y < arrayNumbers.length; y++) {
                System.out.print(arrayNumbers[y] + "\t");
            }
        } else {
            System.out.printf("Size does not exceed 20");
        }
    }
}


