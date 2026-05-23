import java.util.Scanner;

public class array2d {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] numb = new int[rows][col];

        // Input
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < col; j++) {
                numb[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print(numb[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}

//col lenth same h = >

//nt collength=brr[0].lenght

//col length dfii h toh =>
//liaise hi main kisi new row me aaya
//same point pr maine uss row ka collength find out kalia
//currentrow=brr[rowindex]
//col kitne h = brr[rowindex].lenghth

