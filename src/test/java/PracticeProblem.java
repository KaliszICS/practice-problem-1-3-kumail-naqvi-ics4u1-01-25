import java.io.*;

public class PracticeProblem {

    public static String readFile(String filename) {
        FileReader inputStream = null;
        StringBuilder content = new StringBuilder();

        try {
            inputStream = new FileReader(filename);
            int c;

            while ((c = inputStream.read()) != -1) {
                content.append((char) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }

        return content.toString();
    }

    public static String backwardsReadFile(String filename) {
        String content = readFile(filename);
        StringBuilder reversed = new StringBuilder(content);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Read file.txt: ");
        System.out.println("'" + readFile("file.txt") + "'");
        System.out.println("Backwards file.txt: ");
        System.out.println("'" + backwardsReadFile("file.txt") + "'");
    }
}