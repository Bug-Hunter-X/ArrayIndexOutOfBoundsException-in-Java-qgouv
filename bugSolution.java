public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 5 && 0 <= 5 && 5 < arr.length) {
            System.out.println(arr[5]);
        } else {
            System.out.println("Index out of bounds"); // Handle the exception gracefully
        }
    }
}