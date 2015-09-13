class Example4{
    String hello(String name){
        return "Hello " + name;
    }
    public static void main (String [] args){
        Example4 ex4 = new Example4();
        System.out.println(ex4.hello("Bom"));
    }
}