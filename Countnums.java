public class Countnums {
    public static void main(String[] args) {
        int num = 73747;
        int count = 0 ;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 7) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
