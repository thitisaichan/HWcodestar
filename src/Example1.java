class Exmple1{
    double tax(double price){
        return price * 7 / 100;
    }
    public static void main(String [] args){
     Exmple1 ex1 = new Exmple1();
        System.out.println("sum = "+ex1.tax(200));
    }
}