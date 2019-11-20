public class ArraySort {

    //정렬 메소드
    public void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j<arr.length; j++){
                //arr[i]가 arr[j]보다 작을때
                if(arr[i] < arr[j]) {
                    //값을 바꿔준다.
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
