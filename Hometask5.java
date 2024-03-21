import java.util.Random;

public class Hometask5 {
    //Дан массив.
    // Определить:
    // 1.количество максимальных элементов в массиве;
    // 2.количество минимальных элементов в массиве
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(4, 10)];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-50, 50);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");


        }
        int max = array[0];
        int min = array[0];
        int maxCount = 0;
        int minCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxCount = i;
            }
            if (array[i] < min) {
                min = array[i];
                minCount = i;
            }

        }
        System.out.println("\nКоличество максимальных элементов: " + maxCount);
        System.out.println("Количество минимальных элементов: " + minCount);
    }
}

