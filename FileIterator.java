import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

public class FileIterator implements Iterator {

    private int i = 0;

    private final ArrayList<String> text = new ArrayList<>();

    public FileIterator(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        while (line != null) {
            text.add(line);
            line = reader.readLine();
        }
    }

    @Override
    public boolean hasNext() {
        if (i < text.size()) return true;
        return false;
    }

    @Override
    public Object next() {
        i++;
        return text.get(i - 1);
    }
}
