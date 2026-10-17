import java.io.FileOutputStream;
import java.io.IOException;
class FileWrite{
    public static void main(String[] args){
        String data = "writing using FileOutputString";
        try(FileOutputStream fos = new FileOutputStream ("data50.txt")){
            fos.write(data.getBytes());
            System.out.println("file written successfully");
        }
        catch(IOException e){
            System.out.println("error: " + e.getMessage());
        }

    }
}