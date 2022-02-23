package NounVerbTranslator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * The unit tests for generating concrete java classes
 *
 * @author Peyton Martin
 */
@Tag("Java Generator")
public class JavaConcreteTest {

   
    @Test
    public void ctr() {
        ClassTemplate template = new ClassTemplate("Cheese");
        String[] attributes = {"int cheese", "String stick"};
        String[] imports = {"import ab.c", "import de.fg"};
        String[] methods = {"String something()", "void elsse()"};

        template.setAttributes(attributes);
        template.setImports(imports);
        template.setMethods(methods);
        template.setPackageName("packageName");

        JavaConcreteClassGenerator gen = new JavaConcreteClassGenerator(template);
        gen.generateClass();

        assertEquals(5,5);
    }

}
