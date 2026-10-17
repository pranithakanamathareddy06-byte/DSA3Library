import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;class FileWriteBuffered{
    public static void main(String[] args){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("data5.txt"))){
            bw.write("BufferedWriter writes faster and efficiently");
            bw.newLine();
            bw.write("character stream example.");
            System.out.println("data successfully written!");
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}