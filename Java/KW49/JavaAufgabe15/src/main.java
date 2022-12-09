public class main {
    public static void main(String[] args) {
        int minDis = 10;
        int index = 0;
        int[] arr = {4, 8, 6, 1, 2, 9, 4};

        for (int i = 0; i < arr.length - 1; i++){
            int temp = minDis;
            if (arr[i] <arr[i +1]){
                temp = arr[i +1] - arr[i];
            }else if (arr[i +1] < arr[i]){
                temp = arr[i] - arr[i + 1];
            }
            if (temp < minDis){
                minDis = temp;
                index = i;
            }
        }
        System.out.println("Min. Distance: " + minDis);
        System.out.println("Index: " + index);
    }
}
