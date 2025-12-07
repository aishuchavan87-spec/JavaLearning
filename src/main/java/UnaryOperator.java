public class UnaryOperator {
    public static void main(String[] args) {

        int i=5;


        int j=i++ + ++i + ++i + i++ + ++i + ++i;

        //   = 5  +  7   + 8  + 8   +  10  +  11

        System.out.println(j);
    }

}
