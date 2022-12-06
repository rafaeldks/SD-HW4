import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileIterator fi = new FileIterator("/Users/rafaelsajfutdinov/IdeaProjects/FileIterator/src/test.txt");
            while (fi.hasNext()) {
                System.out.println(fi.next());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}