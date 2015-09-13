class Example8{
    double average(double [] a){
        int i = 0;
        double result = 0 ;
         while (i < a.length){
            result = result + a[i];
            i = i + 1;
        }
        return result ;
    }
    public static void main (String [] args){
        double [] a = new double [5];
        a[0] = 5;
        a[1] = 7;
        a[2] = 9;
        a[3] = 9;
        a[4] = 9;
        Example8 ex8 = new Example8();
        double sum = ex8.average(a)/a.length;
        System.out.println(sum);
    }
}