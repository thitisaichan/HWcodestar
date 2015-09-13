class Example9 {
      int find (String s , String [] a){
       int i = 0;
       int Result = 0;
       while (i < a.length){
           if(a[i].equals(s)){
               Result = i;
           }
           i = i + 1;
       }
       return Result;
    }
      
    public static void main(String[] args) {
        String s = "Hermione";
        String [] a = {"Harry", "Ron", "Hermione", "Hagrid" };
        Example9 ex9 = new Example9();
        System.out.println(ex9.find(s, a));
       }
       }