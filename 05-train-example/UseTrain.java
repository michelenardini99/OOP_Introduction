class UseTrain {
    public static void main(String[] args) {
        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         *
         *
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere per i parametri
         *
         * 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente
         *
         * 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe.
         *
         * 4) Cancellare tutte le prenotazioni
         *
         * 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
         * occupazione
         */
        
        Train t = new Train(100,30,70);
        t.reserveFirstClassSeats(10);
        System.out.println(t.getTotOccupancyRatio());
        System.out.println(t.getFirstClassOccupancyRatio());
        t.reserveSecondClassSeats(35);
        System.out.println(t.getTotOccupancyRatio());
        System.out.println(t.getSecondClassOccupancyRatio());
        t.deleteAllReservations();
        t.reserveFirstClassSeats(20);
        System.out.println(t.getTotOccupancyRatio());
        System.out.println(t.getFirstClassOccupancyRatio());
        t.reserveSecondClassSeats(60);
        System.out.println(t.getTotOccupancyRatio());
        System.out.println(t.getSecondClassOccupancyRatio());
    }
}
