package lang.array;

public class Exam40 {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int[] arr2 = new int[5];
        // 배열의 크기는 int 타입의 최대 값에서 2를 뺀 값이다.
        // 배열의 최대 크기 = Integer.MAX_VALUE -2
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 90;
        arr[2] = 80;
        arr[3] = 70;
        arr[4] = 60;
        int sum = 0;
        for(int e : arr){
            sum+=e;
        }
        System.out.println(sum);
    }

}
