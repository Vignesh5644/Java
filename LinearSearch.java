package Vignesh.com;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {27,17,39,194,78,28,74};
        int target = 17;
        boolean ans = Linear(arr,target);
        System.out.println(ans);
    }
    static boolean Linear(int[] arr,int target){
        if (arr.length == 0){
            return false;
        }
        for (int index = 0; index < arr.length ; index++){
            int element = arr[index];
            if (element == target){
                return true;
            }
        }
        return false;
    }
}

