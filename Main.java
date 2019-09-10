package ivan.samoylov;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File allFiles = new File("/");
        File[] listOfFiles = allFiles.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
