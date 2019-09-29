import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random random = new Random();
        for (int i =0; i<10000; i++ ){
            arr[i] = random.nextInt(10000);
        }
        StopWatch stopWatch = new StopWatch();
        for (int i =0; i<9999; i++){
            for (int j = i+1; j<10000; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0;i<10000; i++){
            System.out.println(arr[i] + "");
        }
        stopWatch.stop();
        long result = stopWatch.getElapseedTime();
        System.out.println("thời gian là: " +result);
    }
}
