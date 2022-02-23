package NounVerbTranslator;

public abstract class ClassGenerator {
    ClassTemplate template;

    //TODO try/catch for errors caused by incomplete template
    public ClassGenerator(ClassTemplate template) {this.template = template;}
    
    String appendPackage(){
        return "package " + template.getPackageName() + ";\n";
    }
    protected String appendImports(){
        String tmp = "";
        String[] imports = template.getImports();

        for (int i = 0; i < imports.length; i++) {
            tmp += (imports[i] + ";\n");//might need to add 'import' to the string
        }
        return tmp;
    }
    String appendAttributes() {
        String tmp = "";
        String[] attributes = template.getAttributes();

        for (int i = 0; i < attributes.length; i++) {
            tmp += (attributes[i] + ";\n").indent(4);
        }
        return tmp;
    }
    String appendMethods() {
        String tmp = "";
        String[] methods = template.getMethods();

        for (int i = 0; i < methods.length; i++) {
            tmp += (methods[i] + "{\n\n}\n").indent(4);
        }
        return tmp;
    }

    abstract void generateClass();
    
}