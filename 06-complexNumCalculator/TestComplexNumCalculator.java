class TestComplexNumCalculator {
    public static void main(String[] args) {
        /*
         * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
         *    tra numeri complessi:
         *
         * - add(1+2i, 2+3i) = 3+5i
         *
         * - sub(4+5i, 6+7i) = -2-2i
         *
         * - mul(8+2i, 3-i) = 26 - 2i
         *
         * - ... altre a piacere
         *
         * 2) Verificare il corretto valore dei campi nOpDone, lastRes
         *
         * 3) Fare altre prove con operazioni a piacere
         */
        
        ComplexNumCalculator c = new ComplexNumCalculator();
        c.build();
        ComplexNum1 v1 = new ComplexNum1();
        ComplexNum1 v2 = new ComplexNum1();
        v1.build(1, 2);
        v2.build(2, 3);
        System.out.println( c.add(v1, v2).toStringRep());
        System.out.println(c.nOpDpne + " " + c.lastRes.toStringRep());
        v1.build(4, 5);
        v2.build(6, 7);
        System.out.println( c.sub(v1, v2).toStringRep());
        System.out.println(c.nOpDpne + " " + c.lastRes.toStringRep());
        v1.build(8, 2);
        v2.build(3, -1);
        System.out.println( c.mul(v1, v2).toStringRep());
        System.out.println(c.nOpDpne + " " + c.lastRes.toStringRep());
        v1.build(7, -2);
        v2.build(-5, 1);
        System.out.println( c.div(v1, v2).toStringRep());
        System.out.println(c.nOpDpne + " " + c.lastRes.toStringRep());
    }
}
