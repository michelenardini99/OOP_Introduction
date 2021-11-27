public class Train {
    
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;
    
    public Train(int nTotSeats, int nFirstClassSeats, int nSecondClassSeats) {
        this.nTotSeats = nTotSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
        this.nFirstClassReservedSeats=0;
        this.nSecondClassReservedSeats=0;
    }
    
    void reserveFirstClassSeats(int n) {
        this.nFirstClassReservedSeats+=n;
    }
    
    void reserveSecondClassSeats(int n) {
        this.nSecondClassReservedSeats+=n;
    }
    
    double getTotOccupancyRatio() {
        return ( (double) (this.nFirstClassReservedSeats + this.nSecondClassReservedSeats)/ this.nTotSeats)*100;
    }
    
    double getFirstClassOccupancyRatio() {
        return ((double) this.nFirstClassReservedSeats/this.nFirstClassSeats)*100;
    }
    
    double getSecondClassOccupancyRatio() {
        return ((double) this.nSecondClassReservedSeats/this.nSecondClassSeats)*100;
    }
    
    void deleteAllReservations() {
        this.nFirstClassReservedSeats=0;
        this.nSecondClassReservedSeats=0;
    }
    

}
