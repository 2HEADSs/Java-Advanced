package StreamsFilesAndDirectoriesExercises;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\Exercises Resources";

        File directory = new File(path);
        long sum = 0;
        if(directory.exists()){
            if(directory.isDirectory()){
                File[] files = directory.listFiles();
                for (int i = 0; i < files.length; i++) {
                    sum += files[i].length();
                }

            }
        }
        System.out.printf("Folder size: %d",sum);

    }
}
