package Day2;

public class ConditionalStatment {
   public static void main(String[] args) {
//         int age=23;
//        // String ageGroup="";
//
//        // if (age<=18) {
//             ageGroup="Child";
//        // }
//         else
//        // {
//             ageGroup="Adult";
//         }
//       // System.out.println(ageGroup);

    //Ternary Operator  ? :
    int age=10;
         String ageGroup= age<=18 ? "Child" : "Adult";
         System.out.println(ageGroup);
    }
}
