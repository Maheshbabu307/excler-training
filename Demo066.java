public class Demo066 {
    public static void printIndexes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: " + i);
        }
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Demo066.printIndexes(array);
    }
}
