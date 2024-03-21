import java.util.Arrays;

public class Hometask1 {
    //1.Заполнить массив из двенадцати элементов 1,2,...12
    //2. Вывести элементы массива на экран в обратном порядке
    //3.Определить:
    // 1.сумму всех элементов массива;
    // 2.произведение всех элементов массива;
    // 3.сумму квадратов всех элементов массива;
    // 4.сумму шести первых элементов массива
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(Arrays.toString(array));
        for (int i = array.length -1; i>= 0; i--){
            System.out.print(array[i] + " ");
        }
        int sum = 0;
        for(int i =0;i< array.length;i++){
            sum += array[i];
        }
        System.out.println("\nSum = "+ sum);

        int mult = 1;
        for(int i =0;i< array.length;i++){
            mult *= array[i];
        }
        System.out.println("\nMultiplication = "+ mult);

        int sqrtSum = 0;
        for (int i =0;i< array.length;i++){
            sqrtSum += array[i] *array[i];
        }
        System.out.println("\nSqrtsum= "+ sqrtSum);

        int sumSix = 0;
        for(int i=0;i<6;i++){
            sumSix += array[i];
        }
        System.out.println("\nSumsix = "+ sumSix);
    }




}


