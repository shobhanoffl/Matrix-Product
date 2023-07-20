import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int b = 2;

        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                array[i][j]=array[i][j]*b;
            }
        }

        for (int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}