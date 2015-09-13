class Example5{
    double carTax(int cc, int seat, int door){
        return cc * 0.75 + seat * 65 + door * 120;
    }
    public static void main(String [] args){
        Example5 ex5 = new Example5();
        System.out.println("vat this car = " + ex5.carTax(120, 4, 4));
    }
}
