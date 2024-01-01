package StreamsFilesAndDirectoriesExercises;

import java.io.*;

public class SerializeCustomObject {
    public static void main(String[] args) {
        Course course = new Course("Java Advance", 250);

        String path = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\course.ser";
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);

             ObjectOutput objectOutputStream = new ObjectOutputStream(fileOutputStream);

             FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)

        ) {
            //serializing
            objectOutputStream.writeObject(course);

            //deserializing
            Object deserializedObject = (Course) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
