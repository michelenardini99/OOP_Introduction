

public class Recognizer {
    
    boolean[] seq = new boolean[5];
    
    void reset() {
        this.seq[1]=false;
        this.seq[2]=false;
        this.seq[3]=false;
        this.seq[4]=false;
    }

    boolean check1(int n) {
        reset();
        if(n==1) {
            this.seq[1]=true;
            return true;
        }
        return false;
    }
    
    boolean check2(int n) {
        reset();
        if(n==2) {
            this.seq[2]=true;
            return true;
        }
        return false;
    }
    
    boolean check3(int n) {
        reset();
        if(n==3) {
            this.seq[3]=true;
            return true;
        }
        return false;
    }
    
    boolean check4(int n) {
        reset();
        if(n==4) {
            this.seq[4]=true;
            return true;
        }
        return false;
    }
    
    int nextExpectedInt() {
        for(int n=1;n<seq.length;n++) {
            if(seq[n] == true) {
                if(n != 4) {
                    return n+1;
                }else {
                    return 1;
                }
            }
        }
        return 1;
    }
   
}
