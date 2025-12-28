public class calculatorDemo {
    public static void main(String[] args) {

        //Method Overloading-Polymorphism - compile time polymorphism

        calculator.print();
        calculator.add(20,30);

        int result= calculator.add(10,20);
        System.out.println(result);

        double result1=calculator.add(10.2, 8.2);
        System.out.println(result1);


    }
}

//return type - not depend
//signature - name +parameter type

class calculator {


    static void print() {
        System.out.println("Hello , I am doing Method Overloading which is Polymorphism");
    }

    /**
     * Add method will sum 2 values which is provided as param. <BR/>
     * Author of this method is <b>Aishwarya Chavan</b>
     * @param a
     * @param b
     * @return
     */
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    static int add(int a, int b,int c) {
        int d = a + b + c;
        return d;
    }

    static double add(double a, double b) {
        double c = a + b;
        return c;
    }
}
