package NounVerbTranslator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextUml {
    void checkTextUml(String className) throws FileNotFoundException{ //make sure coding grammar is right for attributes and methods
        File file = new File(className + ".txt");
        
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            if (!name.contains("\t")) {
                while (scanner.hasNextLine()) {
                    String classData = scanner.nextLine();
                    if (!classData.contains("\n")) {
                        //check for attribs, methods, etc
                    }
                    else {break;}
                }
            }
        }

        scanner.close();
    }
    //void fixTextUml(fileName){}
}
