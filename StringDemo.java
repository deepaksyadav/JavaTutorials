public class StringDemo {
    public static void main(String[] str){
        // Strings in Java are immutable objects of the String class.
        // When you create a string using a string literal (e.g., String s = "Hello";),
        // Java stores it in a String Pool for memory efficiency.

        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2); // true
        {
            //But creating strings with new String() creates a new object
            String s3 = new String("Java");
            System.out.println(s1 == s3); // false
        }
        {
            System.out.println("___________________________");
            System.out.println("Comparing Strings with ==");
            //Comparing Strings with ==
            //Use Case
            //Only use == if you want to check object identity, not content.
            String a = "Hello";
            String b = "Hello";
            String c = new String("Hello");

            System.out.println(a == b); // true (same reference in string pool)
            System.out.println(a == c); // false (different objects)
        }
        {
            System.out.println("---------------------------------");
            System.out.println("Comparing Strings with .equals()");
            //Comparing Strings with .equals()
            //The .equals() method compares content of the strings character-by-character.
            String a = "hello";
            String b = new String("hello");

            System.out.println(a.equals(b)); // true (same content)
            //.equals() is case-sensitive:
            System.out.println("Hello".equals("hello")); // false
            //Recommended Usage
            //Always use .equals() to compare string contents unless object identity is your goal.
        }
        {
            System.out.println("----------------------------");
            System.out.println("Using .equalsIgnoreCase()");
            //Using .equalsIgnoreCase()
            //To perform case-insensitive string comparison, use .equalsIgnoreCase():
            String a = "Java";
            String b = "java";

            System.out.println(a.equalsIgnoreCase(b)); // true
        }
        {
            //Using Objects.equals(a, b)
            // Objects.equals(a, b) is used for null-safe
            // comparison of objects, including strings.

        }
        {
            // Lexicographical Comparison with .compareTo()
            //Use .compareTo() to compare two strings lexicographically (dictionary order).
            System.out.println("------------------------------------------------");
            System.out.println("Lexicographical Comparison using .compareTo()");

            //  int result = str1.compareTo(str2);
            //  0 → Strings are equal
            //< 0 → str1 is less than str2
            //> 0 → str1 is greater than str2

            String a = "apple";
            String b = "banana";
            System.out.println(a.compareTo(b)); // negative number
            //Case-sensitive
            System.out.println("Apple".compareTo("apple")); // negative (uppercase < lowercase)
            //Case-insensitive Comparison with .compareToIgnoreCase()
            String a1 = "Apple";
            String b1 = "apple";

            System.out.println(a1.compareToIgnoreCase(b1)); // 0
        }
        {
            System.out.println("------------------------------");
            System.out.println("Reference comparison (==)");
            //Reference comparison (==):
            String s3 = "test";
            String s4 = new String("test");

            System.out.println(s3 == s4);       // false
            System.out.println(s3.equals(s4));  // true
        }
        {
            System.out.println("----------------------------------");
            System.out.println("intern()");
            // intern() optimize memory and enable
            // reference comparison (==) for strings with the same content
            //Purpose:
            //To avoid duplicate String objects in memory.
            //To make reference comparisons (==) safe and predictable for
            // identical strings.

            // without intern
            String a = new String("Java");
            String b = new String("Java");
            System.out.println(a == b);          // false (different objects)
            System.out.println(a.equals(b));     // true (same content)

            // With intern()
            String a1 = new String("Java").intern();
            String b1 = "Java";
            System.out.println(a1 == b1);          // true (same reference from pool)
        }
    }
}
