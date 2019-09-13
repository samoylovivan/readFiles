package ivan.samoylov;

import java.io.File;

public class Main {
    private static final String PWD = "/";

    public static void main(String[] args) {
        File allFiles = new File(PWD);
        File[] listOfFiles = allFiles.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
