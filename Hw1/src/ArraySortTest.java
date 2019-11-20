public class ArraySortTest {
    public static void main(String[] args) {
        ArraySort as = new ArraySort();

        int[] arr = {20, 40, 30, 50, 5};

        //정렬 메소드호출
        as.sort(arr);

        //정렬된 배열을 출력
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
