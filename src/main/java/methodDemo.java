public class methodDemo {
    public static void main(String[] args) {

        int finalAddition = Addition (2, 2, 2);
        System.out.println(finalAddition);

        int finalSubstraction = Sub(10,5);
        System.out.println(finalSubstraction);
    }


        //method Name = no space
        //input
        //output
        //method body

        static int Addition ( int a,int b,int c)
        {
            int add = (a + b + c);
            return add;

        }

        static int Sub ( int j, int k) {
        int Substraction = (j-k);
        return Substraction;
        }






}
