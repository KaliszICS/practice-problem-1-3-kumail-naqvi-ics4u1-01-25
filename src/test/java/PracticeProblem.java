import java.io.*;

public class PracticeProblem {

    public static void main(String[] args) {
    
    }


    public static String readFile(String filename) {
        FileReader inputStream = null;
        try {
            inputStream = new FileReader(filename);
            StringBuilder sb = new StringBuilder();
            int c;
            
            while ((c = inputStream.read()) != -1) {
                sb.append((char) c);
            }
            return sb.toString();
        } catch (IOException e) {
            return "";
        } finally {
            try {
                if (inputStream != null) inputStream.close();
            } catch (IOException e) {
        
            }
        }
    }


    public static String backwardsReadFile(String filename) {
        String content = readFile(filename);
        return new StringBuilder(content).reverse().toString();
    }
}
