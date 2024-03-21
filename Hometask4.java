import java.util.Random;

public class Hometask4 {
    //Дан массив.
    // Вывестина экран сначала его не отрицательные элементы,
    // затем отрицательные.
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(4,10)];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-50,50);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }

        int positive = array[0];
        int negative = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positive = array[i];
                System.out.print("\nПоложительные элементы " + positive);
            }
        }
            for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                negative=array[i];
                System.out.print("\nОтрицательные элементы " +negative);
            }



        }

    }}
