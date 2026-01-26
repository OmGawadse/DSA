// 21.
// we all know string are Immutables.
// String Builder: Helps in any type of modification on the string.
public class stringbuilder {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Ghatak and Om");
        System.out.println(sb);

        System.out.println(sb.charAt(8));   // Shows character at index 8.

        // If you want to replace any character in the string, We can do it using set character function.
        sb.setCharAt(6, '_');
        System.out.println(sb);

        // If you want to insert any character in the string, We can do it using insert function.
        sb.insert(0, 'G');
        System.out.println(sb);

        // If you want to delete any character in the string, We can do it using delete function.
        sb.delete(0, 1);



    }
}
