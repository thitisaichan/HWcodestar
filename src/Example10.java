class Example10{
    int i = 0;
    boolean result;
    boolean search(String fileName, String folderName){
        String [] list = new java.io.File(folderName).list();
        {
            while ( i < list.length){
                if (list[i++].equals(fileName)){
                    return result = true;
                }
            }
            }
        return result;
    }
    public static void main (String [] args){
        String fileName = "Example4.java";
        String folderName = "C:/Users/BOM/Documents/NetBeansProjects/Example/src";
        Example10 ex10 = new Example10();
        System.out.println(ex10.search(fileName, folderName));
    }
}