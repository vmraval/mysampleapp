package java8;
public class JavaClass {
    private static JavaClass INSTANCE = null;

    public static JavaClass getInstance()
    {
        if ( INSTANCE == null )
        {
            INSTANCE = new JavaClass();
            System.out.println("No this is only commit and not push.  This is edit of feature");
        }
        return INSTANCE;
    }

    private JavaClass() {
    }
}