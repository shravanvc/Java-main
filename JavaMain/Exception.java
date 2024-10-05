public class Exception {
    public static void main(String[] args) {
        // try And catch
        int[] marks = {96, 97, 98};
        
        try {
            System.out.println(marks[5]);  // Trying to access an invalid index
        } catch(ArrayIndexOutOfBoundsException e ) {
            // Empty catch block, no action taken
        }
        
        System.out.println("the name is aman");
    }
}
