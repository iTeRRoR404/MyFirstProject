public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = 0;
        int min = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
            System.out.println(min);
            System.out.println(max);
    }
}