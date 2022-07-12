package lang.array;

public class Exam46 {
    public static void main(String[] args) {
        int[] arr1; // 배열 레퍼런스만 따로 선언 가능. 레퍼런스 = 메모리 주소를 담는 변수
        arr1 = new int[5]; // 배열 인스턴스(값을 저장하는 메모리) 를 생성하고 그 주소를 레퍼런스에 저장.

        // new int[5] --> 인스턴스(값을 저장하는 메모리)

        int[] arr2 = new int[]{100,90,80,70,60};
        int[] arr3 = {100,90,80,70,60};

    }
}
