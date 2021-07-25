public class Main {
    public static void main(String args[])
    {
        System.out.println("--------------------");
        System.out.println("Heap Sort");
        System.out.println("--------------------");
        int arr_heap[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr_heap.length;
        HeapSort of = new HeapSort();
        System.out.println("Given array is:");
        of.printArray(arr_heap);
        System.out.println();
        of.sort(arr_heap);
        System.out.println("Sorted array is:");
        of.printArray(arr_heap);
        System.out.println(); 
    }
}