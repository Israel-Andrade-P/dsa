import sort.QuickSort;

void main() {
    Integer[] nums = {2, 33, 1, 6, 5, 699, 322, 12};
    QuickSort.quickSort(nums, 0, nums.length-1);
    System.out.println(Arrays.toString(nums));
}