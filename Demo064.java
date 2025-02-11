class SwapArrayElements{
    void swap(int[] arr){
        int len = arr.length;
        System.out.println(arr[0] + "    "+ arr[len-1]); 
        arr[0] = arr[0] + arr[len-1]; 
        arr[len-1] = arr[0] - arr[len-1];
        arr[0] = arr[0] - arr[len-1];
        System.out.println(arr[0] + "    "+ arr[len-1]);
    }
}
public class Demo064 {
    public static void main(String[] args) {
        SwapArrayElements obj = new SwapArrayElements();
        int[] arr = {10,20,50,80};
        obj.swap(arr);
}
}