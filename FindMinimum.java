package Vignesh.com;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {8,21,6,7,2};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1;i< arr.length; i++){
            if (arr[i] <ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
