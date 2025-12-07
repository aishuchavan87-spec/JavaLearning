package Day2;

public class dataTypes {
    public static void main(String[] args)
    {
        byte b1=-128;
        //+127 to -128
        //01111111
        //16bits
        short  s1= 32767;
        System.out.println(s1);
         int i1= 214748364;
        System.out.println(i1);


        byte a=126;
        short c=(short)a;
        System.out.println(c);


       short d=350;
        byte e=(byte)d;
        System.out.println(e);

        //11000000
           //1000000
          // 0111111= 63+1 = -64

        //101011110
        //01011110


        int p=037;
        byte f=(byte)p;
        System.out.println(f);


        char ka =('\u0910');
        char sh= ('\u0936');
        char va=('\u0935');
        char rya=('\u092f');
        char matra = ('\u0974');
        System.out.println("" +ka+sh+va+rya+matra);
    }
}
