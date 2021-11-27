class ComplexNum {

    double re;
    double im;
    
    void build(double re, double im) {
        this.re=re;
        this.im=im;
    }

    boolean equal(ComplexNum1 num) {
        if(num.re==this.re && num.im==this.im) {
            return true;
        }
        return false;
    }

    void add(ComplexNum1 num) {
        this.re+=num.re;
        this.im+=num.im;
    }

    String toStringRep() {
        return ""+this.re+"+("+this.im+"i)";
    }
}
