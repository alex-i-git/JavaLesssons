import java.io.File;

public class FileReader {
    public static void main(String[] args) {
        File file = new File("./");

        String[] structure = file.list();
        for (String str: structure){
            System.out.println(str);
        }
    }
}
