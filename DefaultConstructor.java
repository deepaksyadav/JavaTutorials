class DefaultConstructor {
    int a;
    boolean b;
    public static void main(String[] args) {
        // calls default constructor
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}