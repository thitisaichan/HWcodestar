class Example7{
    int total(int [] a){
        int i = 0;
        int result = 0;
        while (i < a.length){
            result = result + a[i];
            i = i + 1;
        }
        return result;
    }
    public static void main(String [] args){
        int [] a = new int [5];
        a[0] = 5;
        a[1] = 6;
        a[2] = 7;
        a[3] = 10;
        a[4] = 4;
        Example7 ex7 = new Example7();
        int sum = ex7.total(a);
        System.out.println(sum);
    }
}