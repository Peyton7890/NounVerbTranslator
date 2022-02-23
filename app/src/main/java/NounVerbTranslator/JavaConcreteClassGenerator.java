package NounVerbTranslator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaConcreteClassGenerator extends ClassGenerator {

    public JavaConcreteClassGenerator(ClassTemplate template) {super(template);}

    @Override
    void generateClass() {
        File file = new File(template.getClassName() + ".java");
        // String[] methods = {"int hmm()", "void who()"};

        try {
            file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(appendPackage()+ "\n");
            writer.append(appendImports()+ "\n");
            writer.append("public class " + template.getClassName() + "{\n");
            writer.append(appendAttributes()+ "\n");
            writer.append(appendMethods());
            writer.append("}");

            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }

}