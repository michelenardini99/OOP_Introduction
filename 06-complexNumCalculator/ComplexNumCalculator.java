
public class ComplexNumCalculator {
    int nOpDpne;
    ComplexNum1 lastRes;
    
    void build() {
        this.nOpDpne=0;
    }
    
    ComplexNum1 add(ComplexNum1 v1, ComplexNum1 v2) {
        this.nOpDpne++;
        v1.add(v2);
        return this.lastRes=v1;
    }
    
    ComplexNum1 sub(ComplexNum1 v1, ComplexNum1 v2) {
        this.nOpDpne++;
        this.lastRes.re=v1.re-v2.re;
        this.lastRes.im=v1.im-v2.im;
        return this.lastRes;
    }
    
    ComplexNum1 mul(ComplexNum1 v1, ComplexNum1 v2) {
        this.nOpDpne++;
        this.lastRes.re=v1.re*v2.re;
        this.lastRes.im=v1.im*v2.im;
        return this.lastRes;
    }
    
    ComplexNum1 div(ComplexNum1 v1, ComplexNum1 v2) {
        this.nOpDpne++;
        this.lastRes.re=v1.re/v2.re;
        this.lastRes.im=v1.im/v2.im;
        return this.lastRes;
    }
}
