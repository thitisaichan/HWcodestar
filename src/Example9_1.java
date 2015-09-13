
import java.util.Arrays;

class Example9_1{
    int [] divider(int n) {
        int i = 1;
        int a = 0;
        int sum ;
        int [] result = new int[n];
        
        while(i <= n){
        sum = n / i;
        if(sum * i == n){
            result[a] = sum;
        }
        i = i + 1;
        a = a + 1;
        
        }
        return result;
}
    public static void main(String[] args) {
        Example9_1 ex91 = new Example9_1();
        System.out.println(Arrays.toString(ex91.divider(24)));
    }
}