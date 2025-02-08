public class Demo062 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
        
        if (arr.length > 0) {
            System.out.println("First element: " + arr[0]);
            if (arr.length > 1) {
                System.out.println("Second element: " + arr[1]);
            }
            System.out.println("Last element: " + arr[arr.length - 1]);
        } else {
            System.out.println("Array is empty.");
        }
    }
}