
public class Calculator {
    
    int nOpDpne;
    double lastRes;
    
    void build() {
        this.nOpDpne=0;
        this.lastRes=0;
    }
    
    double add(double v1, double v2) {
        this.nOpDpne++;
        return this.lastRes=v1+v2;
    }
    
    double sub(double v1, double v2) {
        this.nOpDpne++;
        return this.lastRes=v1-v2;
    }
    
    double mul(double v1, double v2) {
        this.nOpDpne++;
        return this.lastRes=v1*v2;
    }
    
    double div(double v1, double v2) {
        this.nOpDpne++;
        return this.lastRes=v1/v2;
    }

}
