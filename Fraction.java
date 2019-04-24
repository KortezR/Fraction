public class Fraction {
    private Complex numerator;
    private Complex denominator;

    Fraction (Complex m, Complex n) {
        this.setNumerator(m);
        this.setDenominator(n);
    }


    public Complex getNumerator() {
        return numerator;
    }

    public void setNumerator(Complex numerator) {
        this.numerator = numerator;
    }

    public Complex getDenominator() {
        return denominator;
    }

    public void setDenominator(Complex denominator) {
        this.denominator = denominator;
    }

    public Fraction sum(Fraction a) {
        Complex ad = this.numerator.multiply(a.denominator);
        Complex cb = a.numerator.multiply(this.denominator);
        Complex bd = this.denominator.multiply(a.denominator);
        return new Fraction(ad.sum(cb), bd);
    }

    @Override
    public String toString(){
        System.out.print(this.numerator);
        System.out.print("/ ");
        System.out.print(this.denominator);
        return " ";
    }
}
