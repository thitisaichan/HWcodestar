class Example3{
    double areaOfRectangle(double width,double height){
        return width * height;    
}
    public static void main(String [] args){
        Example3 ex3 = new Example3();
        System.out.println("Sum = " + ex3.areaOfRectangle(30,20) );
    }
}