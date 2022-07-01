import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,2,6,84,83,93,182};
        int[] newArr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(newArr);
        int max1 = newArr[newArr.length-1];
        int max2 = newArr[newArr.length-2];
        int sum = 0;
        for (int i = 0; i < newArr.length; i++) {
            sum = max1 + max2;
        }
        System.out.println("Tong gia tri cua 2 phan tu lon nhat la: " + sum);
    }
}

