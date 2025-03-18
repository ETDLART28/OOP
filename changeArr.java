import java.util.Scanner;
public class changeArr {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        System.out.print("kitne rows hona :");
        int rows=in.nextInt();
        System.out.print("kitne columns hona :");
        int cols=in.nextInt();

        int[][]arr=new int [rows][cols];

        System.out.println("elements daalo bhai:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("\n Og arr :");
        printMatrix(arr);   
            int [][]changeArr=new int [cols][rows];
            for (int i=0;i<rows;i++){
                for (int j = 0;j<cols;j++){
                    changeArr[j][i]=arr[i][j];
                   
                }
            } 

                
            System.out.println("\n change arr :");
            printMatrix(changeArr);

            in.close(); //  To Close scanner 
        }
    
        // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }
    