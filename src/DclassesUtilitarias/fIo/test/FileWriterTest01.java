package DclassesUtilitarias.fIo.test;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("O devDojo é lindo, melhor curso do Brasilllllllll\nContinuando a contoria na próxima linha\n");
            fw.flush();
        } catch (IOException ex ) {
            ex.printStackTrace();
        }
    }
}
