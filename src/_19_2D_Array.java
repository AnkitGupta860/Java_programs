import java.util.Scanner;
public class _19_2D_Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[][] flats = new int[2][3];
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                flats[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
