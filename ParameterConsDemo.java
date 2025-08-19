public class ParameterConsDemo {
    String languages;
    // constructor accepting single value
    ParameterConsDemo(String lang) {
        languages = lang;
        System.out.println(languages + " Programming Language");
    }
    public static void main(String[] args) {
        // call constructor by passing a single value
        ParameterConsDemo obj1 = new ParameterConsDemo("sdfnsdmfn");
        ParameterConsDemo obj2 = new ParameterConsDemo("Kotlin");
        ParameterConsDemo obj3 = new ParameterConsDemo("Rust");
    }
}