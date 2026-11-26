package file;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class Sample03 {
    public static void main(String[] args) throws Exception {
        // URL u = new URL("https://example.com/");
        URL u = URI.create("https://example.com/").toURL();
        InputStream is = u.openStream();
        int i = is.read();
        while(i!=-1){
            char c = (char)i;
            System.out.print(c);
            i = is.read();
        }
    }
}
