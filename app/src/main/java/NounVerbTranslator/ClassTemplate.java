package NounVerbTranslator;

public class ClassTemplate {

    protected String className;
    protected String packageName;
    protected String[] imports;
    protected String[] attributes;
    protected String[] methods;

    public ClassTemplate(String className) {this.className = className;}

    public String getClassName() {
        return className;
    }
    public String getPackageName() {
        return packageName;
    }
    public String[] getImports() {
        return imports;
    }
    public String[] getAttributes() {
        return attributes;
    }
    public String[] getMethods() {
        return methods;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
    public void setImports(String[] imports) {
        this.imports = imports;
    }
    public void setAttributes(String[] attributes) {
        this.attributes = attributes;
    }
    public void setMethods(String[] methods) {
        this.methods = methods;
    }
    
}
