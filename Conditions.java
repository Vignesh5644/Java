public class Conditions {
    public static void main(String[] args) {
        int salary = 14000;
     //   if (salary>10000){
     //       salary = salary + 2000;
     //   }else {
     //       salary = salary + 1000;
      //  }
       // System.out.println(salary);

        //multiple  if-else
        if (salary>15000){
            salary += 2000; //  shortcut form of salary = salary + 2000
        } else if (salary>12000) {
            salary += 3000;
        }else {
            salary +=1000;
        }
        System.out.println(salary);
    }
}
