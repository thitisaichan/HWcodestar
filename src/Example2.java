class Example2 {
    double areaOfCircle(double redius){
        return redius * redius * Math.PI;
    }
    public static void main(String [] args){
        Example2 ex2 = new Example2();
        System.out.println("Sum = " + ex2.areaOfCircle(10));
    }
}