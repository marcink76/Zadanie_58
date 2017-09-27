import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int rowIndex = 3;
        int columnIndex = 3;
        int count = 0;
        int count2 = 0;

        int[][] array = new int[columnIndex][rowIndex];
        int[] sum = new int[columnIndex];
        Scanner scanner = new Scanner(System.in);

        //Wstawianie liczb
        do {
            count = 0;
            do {
                System.out.println("Podaj liczbę, kolumna: " + count + " wiersz: " + count2);
                int inputNumber = scanner.nextInt();
                array[count][count2] = inputNumber;
                sum[count2] += array[count][count2];
                count++;
            } while (count <= columnIndex - 1);
            count2++;
        } while (count2 <= rowIndex - 1);

        count2 = 0; // zerowanie licznika

        do {
            count = 0;
            do {
                System.out.print(array[count][count2] + " ");
                count++;
            } while (count <= columnIndex - 1);
            count2++;
            System.out.println();
        } while (count2 <= rowIndex - 1);

        for (int temp : sum) {
            System.out.println("Sumy poszczególnych wierszy to: " + temp);
        }
    }
}
