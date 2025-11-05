public class PracticeProblem {

    public static void main(String[] args) {
    
    }

    public static String readFile(String filename) {
        StringBuilder sb = new StringBuilder();
        try (java.io.FileReader fr = new java.io.FileReader(filename)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                sb.append((char) ch);
            }
        } catch (java.io.IOException e) {
            return "";
        }
        return sb.toString();
    }

    public static String backwardsReadFile(String filename) {
        String s = readFile(filename);
        if (s.isEmpty()) return "";
        return new StringBuilder(s).reverse().toString();
    }


}
