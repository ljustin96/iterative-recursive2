public class PrintString {

    public static void printStringIteratively (String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            System.out.print(s.charAt(s.length()-1));
            s = s.substring(0, s.length()-1);
        }
        System.out.println();
    }
    
    public static void printStringRecursively (String s, int size) {
        if (size == 0) {
            System.out.println();
        }
        else {
            // print the first character
            System.out.print(s.charAt(size-1));
            // print the rest of the string
            printStringRecursively(s.substring(0,size),size-1);
        }     
    }
    
    public static void main(String[] args) {
        String s;
        s = "Test String";
        // Print string iteratively
        System.out.println("Original string: " + s);
        System.out.print("String printed using an iterative approach is: ");
        printStringIteratively(s);
        // Print string recursively
        System.out.println();
        System.out.println("Original string: " + s);
        System.out.print("String printed using a recursive approach is: ");
        printStringRecursively(s,s.length());
        s = "One more time";
        // Print string iteratively
        System.out.println();
        System.out.println("Original string: " + s);
        System.out.print("String printed using an iterative approach is: ");
        printStringIteratively(s);
        // Print string recursively
        System.out.println();
        System.out.println("Original string: " + s);
        System.out.print("String printed using a recursive approach is: ");
        printStringRecursively(s,s.length());
    }    
}