import search.BinarySearch;

public class Main {
    static void main() {
        int[] nums = new int[]{12, 22, 32, 44, 54, 69, 71, 89, 90, 102};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(nums, 103));
    }
}