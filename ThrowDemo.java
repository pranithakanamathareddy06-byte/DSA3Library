class ThrowDemo{
    static void readFile() throws java.io.FileNotFoundException{
        java.io.FileInputStream fis =
        new java.io.FileInputStream("data.txt");

        System.out.println("File is Found");
    }
    public static void main(String[] args){
     try{
            readFile();
        }
        catch(java.io.FileNotFoundException e){
            System.out.println("handled " + e);

        }
    }
}