import java.io.*;

public class HelloWorld {

    public static void main(String[] args) throws IOException {
        runAllHello();
    }

    public static void runAllHello() throws IOException {
        File f = new File("src/hello_unicode.txt");
        BufferedReader r = new BufferedReader(new FileReader(f));
        String line;
        while ((line = r.readLine()) != null) {
            System.out.println(line);
        }
    }

}
