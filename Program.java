public class Program {
    public static void main(String[] args) {
        Complex x = new Complex(2,3);
        Complex y = new Complex(3,-2);
        System.out.println(x);
        System.out.println(y);
        Fraction d1 = new Fraction(x, y);
        Fraction d2 = new Fraction(new Complex(5,4), new Complex(2,5));
        Fraction d3 = new Fraction(new Complex(4,2), new Complex(3,1));
        Fraction d4 = new Fraction(new Complex(1,2), new Complex(3,4));
        System.out.println(d1);
        System.out.println(x.sum(y));
        System.out.println(x.multiply(y));
        System.out.println(d1.sum(d2));
        System.out.println();
        Fraction[] fractionArray = new Fraction[]{d1, d2, d3, d4};
        show(fractionArray);
        arrayAdd(fractionArray);
        show(fractionArray);
    }

    public static void arrayAdd(Fraction[] ar) {
        for (int i=0; i < ar.length-1; i++) {
            if ((i+1)%2==0) ar[i]=ar[i].sum(ar[i+1]);
        }
    }

    public static void show(Fraction[] ar) {
        for (int i=0; i < ar.length; i++) {
            System.out.print(ar[i]);
            if(i < ar.length-1) System.out.print(", "); else
                System.out.print(".");
        }
        System.out.println();
    }
}
