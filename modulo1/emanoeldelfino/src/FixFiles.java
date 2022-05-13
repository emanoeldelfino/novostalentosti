import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class FixFiles {   
    static void modifyFile(String filePath, String oldString, String newString) {
        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
         
        try {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            
            //Reading all the lines of input text file into oldContent
            String line = reader.readLine();
             
            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
            String newContent = oldContent.replace(oldString, newString);
             
            //Rewriting the input text file with newContent
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Closing the resources
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        String parentFolder = "C:\\Users\\1217005964\\OneDrive - Univille\\modulo1\\emanoeldelfino\\src\\";
        String path, renameStr, renameTo;
        for (int i = 1; i <= 82; i++) {
            if (i > 68 && i < 72) continue;
            renameStr = String.format("Ex%02d", i);
            renameTo = String.format("Exercicio%02d", i);
            path = String.format("%sEx%02d.java", parentFolder, i);
            System.out.println(path);
            modifyFile(path, renameStr, renameTo);
        }

        System.out.println("done");
    }
}
