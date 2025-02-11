public class Demo065 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        
        Demo065.printArray(array);
    }
}
