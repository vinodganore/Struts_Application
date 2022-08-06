package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String s1 = "java";
        String s2 = "java";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        s1 = "C++";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);

    }
}
