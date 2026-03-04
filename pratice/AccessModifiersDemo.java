package accessdemo;

class Base {
    private String privateField = "Private";
    String defaultField = "Default";
    protected String protectedField = "Protected";
    public String publicField = "Public";

    void internalAccess() {
        System.out.println(privateField);
        System.out.println(defaultField);
        System.out.println(protectedField);
        System.out.println(publicField);
    }
}

class SamePackage {
    void access() {
        Base b = new Base();
        System.out.println(b.defaultField);
        System.out.println(b.protectedField);
        System.out.println(b.publicField);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Base b = new Base();
        b.internalAccess();
        
        SamePackage s = new SamePackage();
        s.access();
    }
}