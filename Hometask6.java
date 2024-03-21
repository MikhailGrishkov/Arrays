import java.util.Random;

public class Hometask6 {
    //Составить программу:
    // 1.нахождения минимальногo означения среди элементов любой строки двумерного массива;
    // 2.нахождениям аксимально гозначения среди элементов любого столбца двумерного массив
    public static void main(String[] args) {
        Random r = new Random();
        int[][] array2d = new int[r.nextInt(4,8)][r.nextInt(4,8)];

        for(int i=0;i<array2d.length; i++){
            for(int j=0;j<array2d[i].length; j++){
                array2d[i][j] = r.nextInt(30);
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
        int maxValue = 0;
        int minValue =0;
        for(int i=0;i<array2d.length;i++){
             maxValue = array2d[0][i];
             for(int j =1;j> array2d.length;j++){
                 if(maxValue>array2d[j][i]){
                 maxValue=array2d[j][i];
             }
        }
            System.out.println("Максимальное значение: " + maxValue);
    }
        for(int i =0;i<array2d.length;i++){
            minValue = array2d[0][i];
            for(int j =1;j< array2d.length;j++){
                if(minValue>array2d[j][i]){
                    minValue=array2d[j][i];
                }
            }
            System.out.println("Минимальное значение: " + minValue);
        }
}}
