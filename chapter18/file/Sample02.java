package file;

import java.io.FileWriter;

public class Sample02 {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("data/output.txt");
        fw.write("some");
        fw.write("datas");

        fw.close();
    }
}
