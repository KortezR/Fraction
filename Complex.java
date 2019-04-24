public class Complex {
    private double re;
    private double im;

    Complex (double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public Complex sum(Complex a) {
        return new Complex(this.re + a.re, this.im + a.im);
    }

    public Complex multiply(Complex a) {
        return new Complex (this.re * a.re - this.im * a.im,this.re * a.im + this.im * a.re);
    }

    @Override
    public String toString(){
        System.out.print("(" + re + (im < 0.0 ? "" : "+") + im + "i)");
        return " ";
    }
}
